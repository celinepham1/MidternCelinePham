package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int c = 0, t = 1,p,i,count=40;
        System.out.println(c);
        System.out.println(t);
        for(i=2;i<count; ++i){
            p = c + t;
            System.out.println(" "+p);
            c=t;
            t=p;
        }

    }
}
