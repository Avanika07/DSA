package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

	public static void main(String[] args) {
		
		String s="aashique";
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(char c:s.toCharArray())//convert to character
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(int i=0;i<s.length();i++) {
			if(map.get(s.charAt(i))==1) {
				System.out.println("index : "+i);
				return;
			}
		}
		
		System.out.println("no element");

	}

}
