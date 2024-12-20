package com.logicalclasses.array;

public class Array_08 {

	public static void main(String[] args) 
	{
		System.out.println(sumOfArray());

	}
	
	public static int sumOfArray() {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		
		for(int i = 0;i<arr.length;i++) {
			sum = sum +arr[i];
		}
		return sum;
		
		
	}
	
	

}
