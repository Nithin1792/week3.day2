package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] company = {"HCL", "Wipro", "Aspire Systems", "CTS"};

	List<String> strList= new ArrayList<String>();
	strList.addAll(Arrays.asList(company));
	System.out.println("List of elements: " + strList);
	
	Collections.sort(strList);
System.out.println("Sorted Lsit: "  +strList);		

Collections.reverse(strList);
System.out.println("Reverse Lsit:" + strList);
	
	
	
	
	
	
	
	}

}
