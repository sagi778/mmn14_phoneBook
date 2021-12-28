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
    //private Label list;
    
    
    

    Logic phoneBook = new Logic();


    public void add(ActionEvent event) {

        String name = nameField.getText();
        String phone = phoneField.getText();
        Person row = new Person(name,phone);
        System.out.println( row + " Added.");

        //list.setText( "fghjghjgdfhj" );

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
