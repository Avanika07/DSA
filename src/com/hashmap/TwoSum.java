package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int nums[]= {2,7,11,15};
		int target=9;
		
		//create map to store k,values
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			int complement=target-nums[i];
			if(map.containsKey(complement)) {
				System.out.println("indexes : "+map.get(complement)+" "+i);
				return;
			}
			map.put(nums[i], i);
		}
		
		System.out.println("no pair found");

	}

}
