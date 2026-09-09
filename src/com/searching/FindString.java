package com.searching;

public class FindString {

	public static void main(String[] args) {
		
		String[] names= {"ram","rani","sam","raj"};
		String target="rani";
		boolean found=false;
		
		for(String str:names) {
			if(str.equals(target)) {
				found=true;
				break;
			}
		}
		
		System.out.println(found?"Target is present":"Target is not present");

	}

}
