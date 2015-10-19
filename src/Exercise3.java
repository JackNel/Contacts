import java.util.ArrayList;

/**
 * Created by Jack on 10/19/15.  Example of a nested for loop.
 */
public class Exercise3 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        ArrayList<String> twoNames = new ArrayList();

        for (String name : names) {
            for (String name2 : names) {
                if (!name.equals(name2)) {
                    System.out.println(String.format("%s, %s", name, name2));
                }
            }
        }//for loop
    }//main method
}//class Exercise3
