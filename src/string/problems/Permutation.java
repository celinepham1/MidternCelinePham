package string.problems;

public class Permutation {

    public static String w(String q, int i,int j){
        char[]p = q.toCharArray();
        char pb;
        pb = p[i];
        p[i] = p[j];
        p[j] = pb;
        return String.valueOf(p);
    }

    public static void main(String[] args) {
        String st = "ABC";
        int l = st.length();
        System.out.println("Permutations are:");
        perm(st,0,l);
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
    }

    public static void perm(String st, int k, int d){
        if (k==d-1)
            System.out.println(st);
            else{
                for(int i=k; i< d; i++){
                    st=w(st,k,i);
                    perm(st,k+1,d);
                    st = w(st,k,i);
                }

        }
    }

}
