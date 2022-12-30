package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        for (String w : wordNLength.values()){
            s = w.length() + " " + w;
        }
        //implement

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String word[] = wordGiven.split(" ");
        String topWord = word[0];
        for (int i=1; i<word.length; i++){
            if (word[i].length()>topWord.length()){
                topWord = word[i];
            }
        }
        //implement
        map.put(topWord.length(),topWord);
        return map;
    }
}
