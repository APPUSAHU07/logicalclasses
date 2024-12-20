package com.logicalclasses.array;

public class Array_04 {

	public static void main(String[] args) {
		elementAtIndex(-1);

	}

	public static void elementAtIndex(int index) {
		int arr[] = {100,200,300,400,500};
		int size = arr.length;
			
		if(index <= arr.length-1) {
			System.out.println(arr[index]);
		}else if(index > arr.length) {
			System.out.println("Enter valid index");
		}
	}
}
