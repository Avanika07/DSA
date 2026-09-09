package com.searching;

public class LastOccurrence {

	public static void main(String[] args) {
		
		int arr[]={1,2,2,2,2,2,2,2,2,2,3,4};
		int target=2;
		int left=0;
		int right=arr.length-1;
		int ans=-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				ans=mid;
				left=mid+1;
			}
			else if(target>arr[mid]) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		
		System.out.println("Last occurrence : "+ans);
		

	}

}
