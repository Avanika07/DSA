package com.searching;

public class FirstLastOccur {

	public static void main(String[] args) {
		
		int arr[]={1,2,2,2,2,2,2,2,2,2,3,4};
		int target=2;
		int left=0;
		int right=arr.length-1;
		int first=-1;
		int last=-1;
		
		//for left first occurrence
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				first=mid;
				right=mid-1;
			}
			else if(target<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		
		
		//for right first occurrence
		left=0;
		right=arr.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				first=mid;
				right=mid-1;
			}
			else if(target<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		
		
		left=0;
		right=arr.length-1;
	
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				last=mid;
				left=mid+1;
			}
			else if(target>arr[mid]) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		
		System.out.println("First occurrence : "+first);
		
		System.out.println("Last occurrence : "+last);
		

	}
	
}
