/**
 * Created by Jack on 10/7/15.
 */
public class Contact {
    public String name;  //field
    public String address; //field
    public String email; //field
    public int age;  //field

    public Contact() {  //Default constructor.  Allows you to create an object with no arguments

    }

    public Contact(String name, int age) {  //Class constructor
        this.name = name;  //"this.name" refers to the field above.  "= name" refers to the argument passed into the class constructor.
        this.age = age;
    }
}