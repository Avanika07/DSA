package com.searching;

public class FindElement {

	public static void main(String[] args) {
	
		int arr[]= {28,89,18,37,49};
		int target=18;
		int index=-1;//element index i is not found yet
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		
		System.out.println(index!=-1?"found at index : "+index:"not found");

	}

}
