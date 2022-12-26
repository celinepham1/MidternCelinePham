package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {

		int i = 0;
		int num = 0;
		String numbers = " ";

		for (i = 1; i <= 1000000; i++) {

			int count =0;
			for(num = i; num>=1; num--){
				if(i%num==0){
					count = count +1;
				}
			}
			if(count ==2){
				numbers = numbers + i + " ";
			}
		}

		System.out.println(numbers);
			/*
			 * Find list of Prime numbers from number 2 to 1 million.
			 * Try the best solution as possible.Which will take less CPU life cycle.
			 * Out put number of Prime numbers on the given range.
			 *
			 *
			 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
			 *
			 */


	}

}
