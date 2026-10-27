package com.stack;

import java.util.Stack;

public class MinStackDesign {

	Stack<Integer> mainStack=new Stack();
	Stack<Integer> minStack=new Stack();
	
	//insert operation
	public void pushing(int val) {
		mainStack.push(val);
		if(minStack.isEmpty() || val<=minStack.peek()) {
			minStack.push(val);
		}
	}
	
	//removing operation
	public void popping() {
		if(mainStack.peek().equals(minStack.peek())) {
			minStack.pop();
		}
		mainStack.pop();
	}
	
	//returns the top element
	public int topEle() {
		return mainStack.peek();
	}
	
	//returns the minimum elements
	public int getMin() {
		return minStack.peek();
	}
	
	public static void main(String[] args) {
		
		MinStackDesign msd=new MinStackDesign();
		
		msd.pushing(5);
		msd.pushing(-2);
		msd.pushing(0);
		msd.pushing(-3);
		
		System.out.println(msd.topEle());
		System.out.println(msd.getMin());
		msd.popping();     //element is removed
		System.out.println(msd.topEle());
		System.out.println(msd.getMin());
	}
}
