package Phone_Book;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label saveStatus;
    @FXML
    private TextField nameField;
    @FXML
    private TextField phoneField;
    @FXML
    private TextArea book;

    // construct book model/logic
    BookLogic phoneBook = new BookLogic();

    public void add(ActionEvent event) {

        String name = nameField.getText();
        String phone = phoneField.getText();
        Person contact = new Person(name,phone);

        phoneBook.put( contact.getName(), contact.getPhone() );
        book.setText( phoneBook.toString() );

        //book.setText( book.getText() + contact.toString()+ "\n" );
        System.out.println( contact + " Added.");

        nameField.setText("");
        phoneField.setText("");

    }

    public void delete(ActionEvent event) {
        System.out.println("Delete pressed");
    }

    public void save(ActionEvent event) {

        String status = "Phone Book Saved.";
        System.out.println(status);
        saveStatus.setText(status);
    }
}
