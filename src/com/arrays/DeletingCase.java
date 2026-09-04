package com.arrays;

public class DeletingCase {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		int position=2;
		
		
		//creating new array
		int newArr[]=new int[arr.length-1];
		
		//inserting values before position
		for(int i=0;i<position;i++) {
			newArr[i]=arr[i];
		}
		
		//remaining values-->newArr
		for(int i=position;i<newArr.length;i++) {
			newArr[i]=arr[i+1];
		}
		
		System.out.println("after deleting specific position element");
		
		//traverse
		for(int x:newArr) {
			System.out.print(x+" ");
		}

	}

}
