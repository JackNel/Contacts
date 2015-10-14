import java.util.ArrayList;

/**
 * Created by Jack on 10/14/15.
 */
public class Exercise {
    public static void main(String[] args) {

        Contact alice = new Contact();  //By not passing arguments on this line, we are calling the default constructor
        alice.name = "Alice";  //Field sets the name for this object
        alice.age = 25;         //Field sets the age for this object

        Contact bob = new Contact();
        bob.name = "Bob";  //Field sets the name for this object
        bob.age = 35;       //Field sets the age for this object

        ArrayList<Contact> contacts = new ArrayList();
        contacts.add(alice);
        contacts.add(bob);

       // String[] contacts = {"Alice", "Bob", "Charlie", "Austin"};

        for (Contact contact : contacts) { //Always use the for loop for looping over an Array or ArrayList
            if (contact.name.startsWith("A")) {  //contact.name calls the object field defined above
                System.out.println(contact.name);
            }
        }
    }
}