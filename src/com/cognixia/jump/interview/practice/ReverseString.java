package com.cognixia.jump.interview.practice;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverse(String phrase) {
		String reverse = "";
		
		for(int i = phrase.length() - 1; i >= 0; i--) {
			reverse = reverse + phrase.charAt(i);
		}

		System.out.println(reverse);
		return reverse;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter in a phrase: ");
		String string = input.nextLine();
		
		reverse(string);
		
		input.close();

	}

}
