package com.trees;

public class PreOrderTraverse {

	public static void preOrder(TreeNode root) {
		//recursion
		//base condition
		if(root==null) {
			return;
		}
		
		//write recursion sub problem
		System.out.print(root.val+"->");
		preOrder(root.left);
		preOrder(root.right);
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
		
		System.out.println("=====PreOrder Traversal=====");
		preOrder(root);
	}
}
