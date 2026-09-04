package com.arrays;

public class MaxElement {

	public static void main(String[] args) {
		
		int arr[]= {2,5,15,23};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("Maximum : "+max);

	}

}
