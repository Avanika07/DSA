package com.trees;

public class SearchBST {
	
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
		
		return root;
	}
	
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
	
	public static boolean searchNode(TreeNode root,int target) {
		
		if(root==null) {
			return false;
		}
		
		if(root.val==target) {
			return true;
		}
		
		if(target<root.val) {
			return searchNode(root.left,target);
		}
		else {
			return searchNode(root.right,target);
		}

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
        
        System.out.println();
        
        int target=20;
        
        if(searchNode(root,target)) {
        	System.out.println(target+" found target");
        }
        else {
        	System.out.println(target+" not found");
        }
	}
	
}
