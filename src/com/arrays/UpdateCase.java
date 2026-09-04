package com.arrays;

public class UpdateCase {

	public static void main(String[] args) {
		
		int arr[]= {24,25,29,33};
		int position=1;
		
		for(int i=0;i<arr.length;i++) {
			if(position==i) {
				arr[i]=26;
			}
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
