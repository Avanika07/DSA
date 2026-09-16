package com.twopointers;

public class PairSumTP {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,6,9,10,11};
		int target=14;
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				System.out.println("found pair : "+arr[left]+" "+arr[right]);
				left++;
				right--;
			}
			else if(sum<target) {
				left++;
			}
			else {
				right--;
			}
		}

	}

}
