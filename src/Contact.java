/**
 * Created by Jack on 10/7/15.
 */
public class Contact {
    public String name;  //field
    public String address;
    public String email;
    public int age;  //field


    public Contact(String name, int age) {  //CLass constructor
        this.name = name;  //"this.name" refers to the field above.  "= name" refers to the argument passed into the class constructor.
        this.age = age;
    }
}