package com.logicalclasses.array;

public class Array_07 {

	public static void main(String[] args) 
	{
		printArray();

	}

	public static void printArray() 
	{
		int[] a = {1,2,3,4,5,6,7};
		
		// even number
		System.out.print("Even elements are : ");
		for(int i = 0;i<a.length;i++) {
			if(a[i] % 2 == 0) {
				System.out.print(a[i]+ " ");
			}
		}
		System.out.println();
		// odd number
		System.out.print("Odd elements are : ");
		for(int i = 0;i<a.length;i++) {
			if(a[i] % 2 != 0) {
				System.out.print(a[i]+" ");
					}		
				}
	}

}
