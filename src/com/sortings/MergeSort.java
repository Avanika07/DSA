package com.sortings;

import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int[] arr,int nofEle) {
		
		//base condition
		if(nofEle<2) {
			return;
		}
		
		int mid=nofEle/2;
		int leftArr[]=new int[mid];
		int rightArr[]=new int[nofEle-mid];
		
		//fill all the elements before mid
		for(int i=0;i<mid;i++) {
			leftArr[i]=arr[i];
		}
		
		//insert into right array
		for(int i=mid;i<nofEle;i++) {
			rightArr[i-mid]=arr[i];
		}
		
		//left array again dividing small subarray until single element
		mergeSort(leftArr,mid);
		mergeSort(rightArr,nofEle-mid);
		
		//merge the values
		merge(arr,leftArr,rightArr,mid,nofEle-mid);
	}
	
	public static void merge(int arr[],int[] leftArr,int[] rightArr,int left,int right) {
		int i=0,j=0,k=0;
		while(i<left && j<right) {
			if(leftArr[i]<rightArr[j]) {
				arr[k++]=leftArr[i++];
			}
			else {
				arr[k++]=rightArr[j++];
			}
		}
		
		//remaining elements
		while(i<left) {
			arr[k++]=leftArr[i++];
		}
		
		while(j<right) {
			arr[k++]=rightArr[j++];
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {5,9,2,4,8,1,6,3};
		mergeSort(arr,8);
		System.out.println(Arrays.toString(arr));
	}
}
