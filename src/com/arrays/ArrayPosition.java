package com.arrays;

public class ArrayPosition {

	public static void main(String[] args) {
		
		int arr[]= {10,20,40,50};
		int position=2;
		int value=30;
		
		//creating new array with extra length
		int newArr[]=new int[arr.length+1];
		
		//inserting values upto position
		for(int i=0;i<position;i++) {
			newArr[i]=arr[i];
		}
		
		//inserting at specific position
		newArr[position]=value;
		
		//remaining values insert into newArr
		for(int i=position;i<arr.length;i++) {
			newArr[i+1]=arr[i];
		}
		
		//traverse
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}

	}

}
