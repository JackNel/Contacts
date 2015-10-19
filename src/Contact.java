/**
 * Created by Jack on 10/7/15.
 */
public class Contact implements Comparable {
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

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        Contact c = (Contact) o;
        int result = name.compareTo(c.name);
        if (result == 0) {
            return age = c.age;
        } else {
            return result;
        }
    }
}