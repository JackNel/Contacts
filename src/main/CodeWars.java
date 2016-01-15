package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class CodeWars {
    public static void main(String[] args) {
        validateWord("Abcabc");
        validateWord("abcabcd");
        System.out.println(validateWord("Abcabc"));
        System.out.println(validateWord("abcabcd"));
    }

    //If each character appears the same # of times, then true, if each character appears a different # of times,
    // then false.  Ignore case.

    public static boolean validateWord(String word) {
        String[] splitWord = word.split("");
        HashMap<String, Integer> frequencies = new HashMap();

        for (String wordCount : splitWord) {
            String newWord = wordCount.toLowerCase();
            if (frequencies.get(newWord) == null) {
                frequencies.put(newWord, 1);
            }
            else {
                int count = frequencies.get(newWord);
                frequencies.put(newWord, count + 1);
            }
        }
        Collection<Integer> count = frequencies.values();
        ArrayList<Integer> newCount = new ArrayList();
        for (Integer tempCount : count) {
            if (!newCount.contains(tempCount)) {
                newCount.add(tempCount);
            }
        }
        if (newCount.size() == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}