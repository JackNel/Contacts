import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jack on 10/19/15.  Example of a nested for loop.
 */
public class Exercise3 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        HashMap<String, ArrayList<Contact>> people = new HashMap();

        for (String name : names) {
            for (String name2 : names) {
                if (!name.equals(name2)) {
                    Contact c = new Contact(name2, 0);
                    ArrayList<Contact> list = people.get(name);
                    if (list == null) {
                        list = new ArrayList();
                        list.add(c);
                        people.put(name, list);
                    } else {
                        list.add(c);
                    }
                }
            }
        }//for loop

        System.out.println();
    }//main method
}//class Exercise3
