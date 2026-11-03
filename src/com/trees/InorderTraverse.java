package com.trees;

public class InorderTraverse {

	public static void inOrder(TreeNode root) {
		//recursion
		//base condition
		if(root==null) {
			return;
		}
		
		//write recursion sub problem
		inOrder(root.left);
		System.out.print(root.val+"->");
		inOrder(root.right);
	}
	
	public static void main(String[] args) {
		TreeNode root=new TreeNode(2);
		
		root.left=new TreeNode(4);
		root.right=new TreeNode(6);
		
		root.left.left=new TreeNode(7);
		root.left.right=new TreeNode(9);
		
		root.right.left=new TreeNode(5);
		root.right.left.left=new TreeNode(3);
		root.right.left.right=new TreeNode(1);
		
		System.out.println("=====Inorder Traversal=====");
		inOrder(root);
	}
}
