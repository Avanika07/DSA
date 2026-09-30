package com.recursion;

public class OnetoN {

	public static void print(int n) {
		//base condition
		if(n==0) {
			return;
		}
		print(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		
		print(6);
		System.out.println("---------");
		
		int n=6;
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}

	}

}
