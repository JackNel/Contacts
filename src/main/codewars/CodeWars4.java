package main.codewars;

import java.util.ArrayList;


/**
 * Created by Jack on 1/21/16.
 */

//square every digit of a number.
// For example, if we run 9119 through the function, 811181 will come out.
// Note: The function accepts an integer and returns an integer

public class CodeWars4 {
    public static void main(String[] args) {
        System.out.println(squareDigits(919));

    }

    public static int squareDigits(int n) {
        String intStr = Integer.toString(n);
        int[] intArray = new int[intStr.length()];
        for (int i=0; i < intArray.length; i++) {
            intArray[i] = intStr.charAt(i) - '0';
        }
        ArrayList<Integer> intArrayList = new ArrayList();
        for (int temp : intArray) {
            int square = temp * temp;
            intArrayList.add(square);
        }
        String intArrayStr = intArrayList.toString();
        String newIntStr = intArrayStr.replace(", ", "").replace("[", "").replace("]", "");
        int newInt = Integer.valueOf(newIntStr);
        System.out.println(newInt);
        return newInt;
    }
}
