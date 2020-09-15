package com.cognixia.jump.interview.practice;

import java.util.Scanner;

public class DivisibleBy {
	
	public static int[] generateArray(int num) {
		
		int[] array = new int[num];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		return array;
	}
	
	public static void checkDivisible(int[] array) {
		for(int j : array) {
			if(j % 3 == 0 && j % 5 == 0) {
				System.out.println(j + " is divisible by 3 and 5");
			}else if(j % 3 == 0) {
				System.out.println(j + " is divisible by 3");
			}else if(j % 5 == 0) {
				System.out.println(j + " is divisible by 5");
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter in a number: ");
		try {
			int number = input.nextInt();
			
			int[] userArray = generateArray(number);
			
			checkDivisible(userArray);
			
			input.close();
		} catch(Exception e) {
			System.out.println("Please enter a number!!");
		}

	}

}
