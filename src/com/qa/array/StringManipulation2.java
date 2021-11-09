package com.qa.array;

public class StringManipulation2 {
	public static void main(String[] args) {
		method1("find the spaces");
	}
	
	public static void method1(String input) {
		int spaces=0;
		
		for (int i=0; i<input.length(); i++) {
			if (input.substring(i, i+1).equals(" ") || i==(input.length()-1)) {
				spaces++;
			}
		}
		System.out.println("The word count is "+ spaces);
	}
}
