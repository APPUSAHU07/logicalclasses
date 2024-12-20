package com.logicalclasses.array;

public class Array_01 {

	public static void main(String[] args) 
	{
		printArray();

	}

	public static void printArray() 
	{
		int[] arr = {10,20,30,40,50};
		for(int number : arr) {
			System.out.print(number + " ");
		}
		
	}

}
