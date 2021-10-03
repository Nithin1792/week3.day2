package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Syntax of list - import lis and array list
		//<> - call it has Generics, wont accept primitive data type,it will accept only WRAPPER CLASS
		// inside Generic we write WRAPPER class
	//String - String
		//int - Integer
		//boolean - Boolean
		//byte - Byte
		//short - Short
		//float - Float
		//char - Character
		
		
		//List - it is an interface f3 n check 
		// implementation class of list is array list
		
		//empty list:
		List<String> fruits = new ArrayList<String>();
		//List<Integer> values = new ArrayList<Integer>();
		
		//Add elements to list 
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Jackfruit");
		fruits.add("Strawberry");
		
		//to find size of the list
		int size = fruits.size();
		System.out.println("Size of the list: " + size);
		
		//getting an element of list
		fruits.get(2);
		System.out.println(fruits.get(2));
			
		//Print list :
		System.out.println(fruits);
		
		//Print using loop - pass index in get method
	for (int i = 0; i < size; i++) {
		System.out.println(fruits.get(i));
	}
	
	System.out.println("*****Start of foreach***********");
	for (String string : fruits) {
		
		System.out.println(string);
	}
		
		
	}

}
