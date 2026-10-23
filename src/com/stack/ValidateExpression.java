package com.stack;

import java.util.Stack;

public class ValidateExpression {

	public static boolean isValid(String s) {
		//create empty stack
		Stack<Character> stack=new Stack();
		for(char c:s.toCharArray()) {
			if(c=='(') {
				stack.push(')');
			}else if(c=='[') {
				stack.push(']');
			}else if(c=='{') {
				stack.push('}');
			}else if(stack.isEmpty() || stack.pop()!=c) {
				return false;
			}
			else {
				stack.isEmpty();			
				}
		}
		return true;
	}
		
	public static void main(String[] args) {
		
		String s="[(){}[()]]";
		
		System.out.println(isValid(s));
		
	}
		
	
}
