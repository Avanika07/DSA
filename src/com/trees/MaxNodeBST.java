package com.trees;

public class MaxNodeBST {

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

    public static TreeNode findMax(TreeNode root) {
    	
    	if(root==null) {
    		return null;
    	}
    	
    	while(root.left!=null) {
    		root=root.right;
    	}
    	
    	return root;
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
      
      TreeNode max=findMax(root);
      System.out.println("Maximum Node : "+max.val);
      
   }
}
