package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		PriorityQueue<Integer> que = new PriorityQueue<>();
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		que.remove(4);

		System.out.println("The first element using peek is: " + que.peek());

		Iterator<Integer> iter = que.iterator();
		while (iter.hasNext()){
			System.out.println("While loop data retrieving:  " + iter.next());
		}

		for(Integer c: que){
			System.out.println("For loop data retrieving: " + c);
		}



	}

}
