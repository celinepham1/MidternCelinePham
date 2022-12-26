package math.problems;

public class MakePyramid {

    public static void printTriangle(int g)
    {

        for (int i=0; i<g; i++) {


            for (int j=g-i; j>1; j--) {

                System.out.print(" ");
            }

            for (int j=0; j<=i; j++ ) {

                System.out.print("* ");
            }


            System.out.println();
        }
    }


    public static void main(String args[])
    {
        int g = 6;
        printTriangle(g);
    }
  }
