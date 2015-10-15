import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Jack on 10/15/15.
 */
public class Exercise2 {
    public static void main(String[] args) {
/*
        System.out.println("Please type 'hello'");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if (s.equals("hello")) {
                System.out.println("Success!");
                break;
            }
            else {
                System.out.println("Try Again!");
            }
        }

        //another way to do it:
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("hello")) {
            System.out.println("Please type 'hello'");
            input = scanner.nextLine();
        }
        */


        //Example of a nested data structure
        HashMap<String, ArrayList<String>> groups = new HashMap();
        String[] words = {"Alice", "Bob", "Charlie", "Austin", "Albert", "Connor"};
        for (String name : words) {
            String firstLetter = String.valueOf(name.charAt(0));
            ArrayList<String> list = groups.get(firstLetter);
            if (list == null) {
                list = new ArrayList();
                list.add(name);
                groups.put(firstLetter, list);
            } else {
                list.add(name);
            }
        }
        System.out.println(groups);
    }//main method


    static void sayHello(Scanner scanner) {
        String input = "";
        while (!input.equalsIgnoreCase("hello")) {
            System.out.println("Type 'hello'");
            input = scanner.nextLine();
        }

        do {
            System.out.println("Please type 'hello'");
            input = scanner.nextLine();
        } while (!input.equals("hello"));

        while (true) {
            System.out.println("Type 'hello'");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("hello")) {
                System.out.println("Thank you");
                System.exit(0);
            }
        }
    }//static method sayHello
}//class Exercise2
