import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jack on 10/27/15.
 */
public class Exercise5 {
    public static void main(String[] args) {
        String s = "to be or not to be, that is the question.";

        //Remove commas and periods
        s = s.replace(",", "").replace(".", "");
        s = s.toLowerCase();

        //Make it all lowercase
        String[] words = s.split(" ");

        //Remove duplicate words
        ArrayList<String> newWords = new ArrayList();
        for (String word : words) {
            if (!newWords.contains(word)) {
                newWords.add(word);
            }
        }

        //Create a new string without the duplicate words
        String newStr = "";
        for (String newWord : newWords) {
            if (!newStr.isEmpty()) {
                newStr += " ";
            }
            newStr += newWord;
        }
        //to be or not that is the question
        System.out.println(newStr);
    }
}
