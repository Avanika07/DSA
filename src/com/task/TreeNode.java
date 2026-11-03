package com.task;

import com.task.TreeNode;

public class TreeNode {

	String val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(String val) {
		this.val=val;
		this.left=null;
		this.right=null;
	}
	
	public static void main(String[] args) {
		TreeNode root=new TreeNode("A");
		
		root.left=new TreeNode("C");
		root.right=new TreeNode("B");
		
		root.left.left=new TreeNode("F");
		root.left.right=new TreeNode("E");
		root.right.right=new TreeNode("G");
		
		System.out.println(root.left); //object reference
		System.out.println(root.left.val);
		System.out.println(root.right.right.val);
	}
}
