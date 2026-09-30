package com.recursion;

public class Stairs {

	public static int countWays(int n) {
		//base condition
		if(n==0) {
			return 1;
		}
		
		if(n<0) {
			return 0;
		}
		
		return countWays(n-1)+countWays(n-2)+countWays(n-3);
	}
	public static void main(String[] args) {
		
		int n=4;
		System.out.println(countWays(n));

	}

}
