package com.logicalclasses.array;

public class Array_10 {

	public static void main(String[] args) 
	{
		reverse();

	}
	
	public static void reverse() {
		int[] arr = {1,2,3,4,5};
//					 0 1 2 3 4
					 
//		arr.length = 5
		
		for(int i = arr.length-1;i>= 0;i--) {
//			int i = 4;4>= 0; i-- 
			System.out.print(arr[i]+" ");
		}
	}
}

