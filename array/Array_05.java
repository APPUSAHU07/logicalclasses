package com.logicalclasses.array;

import java.util.Scanner;

public class Array_05 {

	public static void main(String[] args) 
	{
		printArray();
	}

	public static void printArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt(); }
	
		if(size%2 != 0) {
			System.out.println(arr[size/2]);
			
		}
		else {
			System.out.println(arr[size/2-1]+" "+arr[size/2]);
		}
	}
	}

