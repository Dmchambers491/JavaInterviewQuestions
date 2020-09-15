package com.cognixia.jump.interview.practice;

public class DescendingOddNumbers {
	
	public static void generateArray(int num) {
		
		int[] array = new int[num];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		printOddArrayDescendingOrder(array);
	}
	
	public static void printOddArrayDescendingOrder(int[] array) {
		
		for(int i = array.length - 1; i >= 0; i--) {
			if(array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		
		generateArray(50);

	}

}
