package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		FileReader fl = null;
		BufferedReader br = null;
		String line;
		String bl = "";

		try{
			fl = new FileReader(textFile);
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}

		try{
			br = new BufferedReader(fl);
			while((line = br.readLine())!=null){
				bl+=line;
			}
		}catch (Exception e){
			System.out.println("Error");
		}

		String[]blArray = bl.split("");
		Stack<String>stack = new Stack<String>();
		LinkedList<String> list = new LinkedList<String>();

		for(String e : blArray){
			list.add(e);
			stack.push(e);
		}
		System.out.println("Linkedlist fifo");
		System.out.print (list.remove() + " ");

		while (!list.isEmpty())
			System.out.print (list.remove() + " ");

		System.out.println();
		System.out.println("Stack FILO");

		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");

		}
		System.out.println();
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */




	}
	}


