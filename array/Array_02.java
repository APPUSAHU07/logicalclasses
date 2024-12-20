package com.logicalclasses.array;

import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args)
	{
		printArray(array());
	}
	
	public static void printArray(int [] arr) {
		
		for(int i = 0;i < arr.length ;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();	
	}
	
	public static int[] array() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the elements for the array ");
		for(int i = 0;i< arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		return arr;
		
	}

}
