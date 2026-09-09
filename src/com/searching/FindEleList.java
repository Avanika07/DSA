package com.searching;

import java.util.Arrays;
import java.util.List;

public class FindEleList {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("pen","paper","book","pencil");
		String target="book";
		
		boolean found=false;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(target)) {
				System.out.println("String is found : "+i);
				return;
			}
		}
		System.out.println("No element found");

	}

}
