package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
    String c, p = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter palindrome:");
        c = s.nextLine();
        int x = c.length();
        for(int i = x - 1; i >= 0; i--) {
            p = p + c.charAt(i);
        }
            if(c.equalsIgnoreCase(p)){
                System.out.println("String is palindrome");

                }else{
                System.out.println("String is not palindrome");

            }

    }
}
