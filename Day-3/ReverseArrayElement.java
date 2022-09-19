package com.blz.javabasic;

import java.util.Scanner;

public class ReverseArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array: ");
		int size = sc.nextInt();
		
		int num [] = new int[size];
		System.out.println("Emter Array Element: ");
		
		for(int i = 0 ; i<size; i++) {
			
			num[i] = sc.nextInt();
		}
		System.out.println("Reversed Array Element: ");
		for(int i = size-1; i>0; i--) {
			
			System.out.println(+num[i]+"" );
		}

	}

}
