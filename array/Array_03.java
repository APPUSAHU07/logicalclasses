package com.logicalclasses.array;

import java.util.Scanner;

public class Array_03 
{
	public static void main(String[] args) {
		printArray();
	}

	public static void printArray() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100);
		}
		for(int array :arr) {
			System.out.print(array+" ");
		}
		
		
	}

}
