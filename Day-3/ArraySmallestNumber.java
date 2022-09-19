package com.blz.javabasic;

public class ArraySmallestNumber {

	public static void main(String[] args) {
		int array[] = new int[]{20,30,50,400,-45,};
		int min = array[0];
		System.out.println("Array Element Are: ");
		
		for(int i = 0 ; i<array.length ; i++) {
			//System.out.println("array[i]");
			
		}
		for(int i = 0 ; i<array.length ; i++) {
			if(array[i] < min)
				min = array[i];
		}
		System.out.println("\nSmallest Element: "+ min);		
		

	}

}
