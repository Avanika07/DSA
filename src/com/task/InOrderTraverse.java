package com.task;

public class InOrderTraverse {

	public static void inOrder(TreeNode root) {
		//base condition
		if(root==null) {
			return;
		}
		
		//recursion for sub problem
		inOrder(root.left);
		System.out.print(root.val+"->");
		inOrder(root.right);
	}
	
	public static void main(String[] args) {
		TreeNode root=new TreeNode("A");
		
		root.left=new TreeNode("B");
		root.right=new TreeNode("F");
		
		root.left.left=new TreeNode("C");
		root.left.left.left=new TreeNode("D");
		root.left.left.right=new TreeNode("E");
		
		root.right.right=new TreeNode("G");
		root.right.right.left=new TreeNode("H");
		root.right.right.right=new TreeNode("I");
		
		System.out.println("======InOrder Traversal======");
		inOrder(root);
	}
}
