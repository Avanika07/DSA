package com.arrays;

public class MinElement {

	public static void main(String[] args) {
		
		int arr[]= {2,5,4,1,7};
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum : "+min);

	}

}
