package com.stack;

import java.util.Stack;

public class Basic {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack();
		
		//inserting elements into the stack
		stack.push(23);
		stack.push(89);
		stack.push(34);
		stack.push(44);
		
		System.out.println(stack);
		System.out.println("top element : "+stack.peek());
		System.out.println("remove element : "+stack.pop());
		System.out.println("after pop print top element : "+stack.peek());
		System.out.println(stack);
		System.out.println("check empty : "+stack.isEmpty());
	}
	
}
