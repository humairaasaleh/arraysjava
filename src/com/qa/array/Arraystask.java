package com.qa.array;

public class Arraystask {

//	public static int[] numArray= new int[10];
//	
//	
//	public static void main(String[] args) {
//
//		numArray[0]=10;
//		numArray[1]=20;
//		
//		for (int i=0; i<=numArray.length; i++) {
//			System.out.println(numArray[i]);
//		}
//		
//	}
	public static int array2[] = { 2, 73, 82, 1, 29, 93 };

	public static void main(String[] args) {
//		for (int i=0; i<=array2.length;i++) {
//			System.out.println(array2[i]);
//		}
		for (int value : array2) {
			int j = value * 10;
			System.out.println(j);

		}

	}
}
