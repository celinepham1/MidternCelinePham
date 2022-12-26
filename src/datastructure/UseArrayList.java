package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> al = new ArrayList<>();
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(1);
		al.remove(1);

		Iterator<Integer> iter = al.iterator();
		System.out.println("Retrieving with while loop:");

		while(iter.hasNext()){
			System.out.println(iter.next());

		}
		System.out.println("Retrieving with for each loop:");
		for(Integer f: al){
			System.out.println(f);
		}

	}

}
