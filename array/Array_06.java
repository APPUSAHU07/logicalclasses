package com.logicalclasses.array;

import java.util.Scanner;

public class Array_06 {

	public static void main(String[] args) 
	{
		System.out.println(sumOfFirstandLast());

	}
	
	public static int sumOfFirstandLast() {
		Scanner sc =  new Scanner(System.in);
		int [] arr = { 1,2,3,4,5,6 };
		
		int sum = arr[0] + arr[arr.length-1];
		
		return sum;
		
	}

}
