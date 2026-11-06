package com.trees;

public class SumOfNodes {
	
	public static int sumNodes(TreeNode root) {
		
		//base case
		if(root==null) {
			return 0;
		}
		
		return root.val+sumNodes(root.left)+sumNodes(root.right);
	}

	public static void main(String[] args) {
		
		  TreeNode root=new TreeNode(2);
			
			root.left=new TreeNode(4);
			root.right=new TreeNode(1);
			
			root.left.left=new TreeNode(3);
			root.left.right=new TreeNode(5);
			
			root.right.left=new TreeNode(7);
			root.right.right=new TreeNode(9);
			
			System.out.println("sum of nodes : "+sumNodes(root));
	}
}
