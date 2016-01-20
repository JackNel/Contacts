package main.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jack on 1/19/16.
 */

//Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible,
// containing distinct letters, - each taken only once - coming from s1 or s2.

public class CodeWars3 {
    public static void main(String[] args) {
        String s2 = "abcdefg";
        String s1 = "efghijklmno";
        longest(s1, s2);
    }


    public static String longest (String s1, String s2) {
        String s3 = s1 +s2;
        String[] splits3 = s3.split("");
        List<String> s3List = Arrays.asList(splits3);
        List<String> filteredList = new ArrayList<>();
        for (String tempStr : s3List) {
            if (!filteredList.contains(tempStr)) {
                filteredList.add(tempStr);
            }
        }
        ArrayList<String> sortedList = new ArrayList();
        for (String word : filteredList) {
            int index = 0;
            for (String sortedWord : sortedList) {
                if (word.compareTo(sortedWord) > 0) {
                    index++;
                }
            }
            sortedList.add(index, word);
        }
        String s4 = String.join("", sortedList);
        System.out.println(s4);
        return s4;
    }
}