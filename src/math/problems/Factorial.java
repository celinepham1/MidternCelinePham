package math.problems;

public class Factorial {
    static int fact(int c) {
        if (c == 0)
            return 1;
        else
            return (c*fact(c-1));
    }
    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         */
    int i, f = 1;
    int num = 5;
    f = fact(num);
        System.out.println("Factorial of "+ num + " is "+f);

        }
}
