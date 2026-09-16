package com.twopointers;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		
		int arr[]= {0,3,0,9,12};
		int slow=0;
		
		
		for(int fast=0;fast<arr.length;fast++) {
			if(arr[fast]!=0) {
				int temp=arr[slow];
				arr[slow]=arr[fast];
				arr[fast]=temp;
				
				slow++; //forward to zero position element
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
