package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare a string "amma123"
		//convert it to char array
		//expected o/p am123
		
		
		String str = "amma123";
		char[] chArr = str.toCharArray();
		
		//Create empty set:
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		for (int i = 0; i < chArr.length; i++) {
			System.out.println("Conerted String into char Array: " + chArr[i]);
			charSet.add(chArr[i]);
			
		}
	System.out.println(charSet);
	
	}

}
