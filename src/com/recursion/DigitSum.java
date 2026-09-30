package com.recursion;

public class DigitSum {

	public static int digitSum(int n) {
		//base condition
		if(n==0) {
			return 0;
		}
		return n%10+digitSum(n/10);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Digit Sum : "+digitSum(1234));

	}

}
