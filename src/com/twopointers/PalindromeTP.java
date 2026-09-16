package com.twopointers;

public class PalindromeTP {

	public static void main(String[] args) {
		
		String s="level";
		int left=0;
		int right=s.length()-1;
		
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				System.out.println("not a palindrome");
				return;
			}
			left++;
			right--;
		}
		
		System.out.println("palindrome");

	}

}
