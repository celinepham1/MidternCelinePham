package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *use for loop
		 *
		 */
		for(int i = 100; i>=90; i-=1){
			System.out.println(i);
		}
		for(int j = 88; j>=70;j-=2){
			System.out.println(j);
		}
		for(int l = 67; l>=40; l-=3){
			System.out.println(l);
		}
		for(int m = 36; m>=0; m-=4){
			System.out.println(m);
		}

	}
}
