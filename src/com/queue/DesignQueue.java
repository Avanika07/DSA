package com.queue;

import java.util.Stack;

public class DesignQueue {

		Stack<Integer> input=new Stack<>();
		Stack<Integer> output= new Stack<>();
		public void push(int val) {
			input.push(val);
		}
		
		public int peek(int n) {
			if(input.isEmpty()) {
				return -1;
			}
			
			if(input.empty()) {
				while(!input.isEmpty()) {
					
				}
			}
			
			return n;
			
		}

		public static void main(String[] args) {
			Stack<Integer> stack=new Stack<>();
			
			stack.add(4);
			stack.add(5);
			stack.add(6);
			stack.add(7);
			
		}
	}

