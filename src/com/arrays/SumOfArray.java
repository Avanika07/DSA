package com.arrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		int arr[]= {12,5,7,6};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum : "+sum);

	}

}
