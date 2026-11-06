package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraverse {
	
	public static void levelOrderTraverse(TreeNode root) {
		
		//create empty queue
		Queue<TreeNode> queueTreeNode=new LinkedList<>();
		
		//add root node to the queue
		queueTreeNode.add(root);
		
		//remove or popup all elements until queue is empty
		while(!queueTreeNode.isEmpty()) {
			//remove the node
			TreeNode treeNode=queueTreeNode.poll();
			
			//print the node which is remove from the queue
			System.out.print(treeNode.val+"->");
			
			//add children to the queue if exist
			if(treeNode.left!=null) {
				queueTreeNode.add(treeNode.left);
			}
			
			if(treeNode.right!=null) {
				queueTreeNode.add(treeNode.right);
			}
		}
	}

	
	//counting the nodes
	public static int countNodes(TreeNode root) {
		//base case
		if(root==null) {
			return 0;
		}
		
		return 1+countNodes(root.left)+countNodes(root.right);
	}
	
	public static void main(String[] args) {
		
        TreeNode root=new TreeNode(2);
		
		root.left=new TreeNode(4);
		root.right=new TreeNode(1);
		
		root.left.left=new TreeNode(3);
		root.left.right=new TreeNode(5);
		
		root.right.left=new TreeNode(7);
		root.right.right=new TreeNode(9);
		
		System.out.println("=======Level Order Traversal=======");
		levelOrderTraverse(root);
		
		System.out.println("======Nodes Count======");
		System.out.println("nodes count : "+countNodes(root));
      
	}
}
