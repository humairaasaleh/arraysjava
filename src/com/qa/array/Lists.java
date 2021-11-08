package com.qa.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
	public static void main(String[] args) {
		List<String> countries = new ArrayList<>();

		countries.add("England");
		countries.add("South Africa");
		countries.add("France");
		countries.add("Albania");
		countries.add("Spain");
//PRINT ENTIRE ARRAY		
//		System.out.println(countries);
		
//USING FOR AND ENHANCED LOOPS
//		for (String value : countries) {
//			System.out.println(value);
//		}	
//		for (int i=0 ; i<countries.size() ; i++) {
//			System.out.println(countries.get(i));
//		}
		
//GET ELEMENT
//		System.out.println(countries.get(2));
		
//SET ELEMENT
//		countries.set(3, "Germany");
//		System.out.println(countries);
		
//REMOVE ELEMENT
//		countries.remove(0);
//		System.out.println(countries);
		
//SORT LIST ALPHABETICALLY
//		Collections.sort(countries);
//		System.out.println(countries);
		
//SWAP
//		Collections.swap(countries, 0, 4);
//		System.out.println(countries);
		
//REVERSE
//		Collections.reverse(countries);
//		System.out.println(countries);

	}

}
