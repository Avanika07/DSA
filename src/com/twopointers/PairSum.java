package com.twopointers;

public class PairSum {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,6};
		int target=6;
		
		boolean found=false;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==target) {
					
					System.out.println("found pair : "+arr[i]+" "+arr[j]);
					found=true;
					return;
					
				}
			}
		}
		
		System.out.println("no pair found");

	}

}
