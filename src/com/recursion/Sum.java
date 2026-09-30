package com.recursion;

public class Sum {
	
	public static int sumLoop(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
	
	//Recursion
	public static int sumRec(int n) {
		//base condition
		if(n==0) {
			return 0;
		}
		return n+sumRec(n-1);
	}

	public static void main(String[] args) {
		
		System.out.println("Loop : "+sumLoop(5));
		System.out.println("Recursion : "+sumRec(5));

	}

}
