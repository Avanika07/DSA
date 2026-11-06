package com.trees;

public class BST {

	public static TreeNode insert(TreeNode root,int value) {
		if(root==null) {
			return new TreeNode(value);
		}
		
		if(value<root.val) {
			root.left=insert(root.left,value);
		}
		
		if(value>root.val) {
			root.right=insert(root.right,value);
		}
		
		return root; //avoid duplicate
	}
	
	//to get the sorted data
	public static void inOrder(TreeNode root) {
		//base condition
		if(root==null) {
			return;
		}
		
		//sub functions
		inOrder(root.left);
		System.out.print(root.val+"->");
		inOrder(root.right);
	}
	
	public static void main(String[] args) {
		
        TreeNode root=null;
        
        root=insert(root,50);
        root=insert(root,30);
        root=insert(root,70);
        root=insert(root,20);
        root=insert(root,40);
        root=insert(root,60);
        root=insert(root,80);
        root=insert(root,65);
		
        System.out.println("======InOrder Traversal======");
        inOrder(root);
	}

}
