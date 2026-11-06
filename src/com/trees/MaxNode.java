package com.trees;

public class MaxNode {

public static int maxNode(TreeNode root) {
		
		//base case
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		
		int leftMax=maxNode(root.left);
		int rightMax=maxNode(root.right);
		return Math.max(root.val, Math.max(leftMax, rightMax));
	}
	
	public static void main(String[] args) {
		
		TreeNode root=new TreeNode(2);
		
		root.left=new TreeNode(4);
		root.right=new TreeNode(1);
		
		root.left.left=new TreeNode(3);
		root.left.right=new TreeNode(5);
		
		root.right.left=new TreeNode(7);
		root.right.right=new TreeNode(9);
		
		System.out.println("Maximum Node : "+maxNode(root));
	}
}
