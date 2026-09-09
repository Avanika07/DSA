package com.searching;

public class FindEven {

	public static void main(String[] args) {
		
		int arr[]= {23,45,20,37,54,88};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Found even number : "+arr[i]);
				return;
			}
			
		}
		
		System.out.println("No element found");
		
	}

}
