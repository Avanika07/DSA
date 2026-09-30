package com.recursion;

public class RecursiveDigitSum {

	public static int digitSum(int n) {
		//base condition
		if(n<10) {
			return n;
		}
		int sum=0;
		while(n>0) {
			sum=sum+n%10; //extract
			n=n/10; //remaining value
		}
		return digitSum(sum);
	}
	
	public static void main(String[] args) {
		
		System.out.println(digitSum(9854));
	}
}
