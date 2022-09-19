package com.blz.javabasic;

import java.util.Scanner;

public class PrintArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array: ");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Emter Array Element: ");
		for(int i =0 ; i<array.length; i++) {
			array[i] =sc.nextInt();
		}
		for(int i = 0; i<size; i++) {
			System.out.println("Array Element: "+array[i]+"" );
		}

	}

}
