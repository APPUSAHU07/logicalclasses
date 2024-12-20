package com.logicalclasses.array;

public class Array_09 {

	public static void main(String[] args) 
	{
		System.out.println(avgOfArray());

	}
	
	public static int avgOfArray() {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		
		
		for(int i = 0;i<arr.length;i++) {
			sum = sum +arr[i];
		}
		return sum/arr.length;
		
		
	}
	
	

}
