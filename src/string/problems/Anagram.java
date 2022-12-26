package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String lis = "listen";
        String sil = "silent";

        lis = lis.toLowerCase();
        sil = sil.toLowerCase();

        if(lis.length() == sil.length()){
            char[] array1 = lis.toCharArray();
            char[] array2 = sil.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            boolean res = Arrays.equals(array1, array2);

            if(res){
                System.out.println(lis + " and " + sil + " are anagrams");
            }else {
                System.out.println(lis + " and " + sil + " are not anagrams");
            }

        }
    }
}
