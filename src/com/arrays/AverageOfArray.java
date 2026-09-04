package com.arrays;

public class AverageOfArray {

	public static void main(String[] args) {
	
		int arr[]= {12,13,14,15};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		double average=(double)sum/arr.length;
		System.out.println("Average : "+average);

	}

}
