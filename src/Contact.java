/**
 * Created by Jack on 10/7/15.
 */
public class Contact {
    public String name;
    public String address;
    public String email;
    public int age;

    public Contact() {  // Object Constructor
        this.name = "Zach Oakes";
        this.email = "zach@ironyard.com";

    }

    public Contact(String name, String address, String email, int age) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.age = age;
    }

    public String getName() {   //Retrieve the name of an object
        return name;
    }

    public void setName(String name) {  //set the name of an object
        this.name = name;
    }

    public static boolean isValidName(String name) {
        return name.length() != 0;
    }
}