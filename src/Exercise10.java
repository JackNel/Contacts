import java.util.Scanner;

/**
 * Created by Jack on 11/10/15.
 */

//Example of reversing an int

public class Exercise10 {
    public static void main(String[] args) {
        int num = 12345;
        String numStr = String.valueOf(num);
        String numStrReversed = new StringBuilder(numStr).reverse().toString();
        int numReversed = Integer.valueOf(numStrReversed);
        System.out.println(numStrReversed);

        /*String numStr = String.valueOf(num);
        String numStrReversed = "";
        for (int i = numStr.length()-1; i >= 0; i--) {
            numStrReversed += numStr.charAt(i);
        }
        int numReversed = Integer.valueOf(numStrReversed);
        System.out.println(numReversed);*/


    }
}