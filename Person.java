package Phone_Book;

public class Person {

    //attributes
    private String _name;
    private String _phone;

    //constructors
    public Person(){
        _name = "";
        _phone = "";
    }
    public Person(String name, String phone){
        _name = name;
        _phone = phone;
    }

    //get & set
    public String getName(){return _name;}
    public String getPhone(){return _phone;}
    public void setName(String name){_name = name;}
    public void setPhone(String phone){_phone = phone;}

    public String toString(){return ( getName() + ", " + getPhone() + _phone); }
}
