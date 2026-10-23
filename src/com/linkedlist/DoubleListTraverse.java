package com.linkedlist;

public class DoubleListTraverse {
	
	public void printFromBeg(DoubleListNode node) {
		
		//first move backward until reach null
		while(node.prev!=null) {
			node=node.prev;
		}
		
		//print now
		while(node!=null) {
			System.out.print(node.val+"->");
			node=node.next;
		}
	}
	
	public void printFromEnd(DoubleListNode node) {
		//move forward
		while(node.next!=null) {
			node=node.next;
		}
		
		//print reverse
		while(node!=null) {
			System.out.print(node.val+"->");
			node=node.prev;
		}
	}
	
	public static void main(String[] args) {
		//creating double list nodes
				DoubleListNode l1=new DoubleListNode(3);
				DoubleListNode l2=new DoubleListNode(7);
				DoubleListNode l3=new DoubleListNode(8);
				DoubleListNode l4=new DoubleListNode(2);
				
				//linking
				l1.next=l2;
				l2.prev=l1;
				
				l2.next=l3;
				l3.prev=l2;
				
				l3.next=l4;
				l4.prev=l3;
				
				DoubleListTraverse dtc=new DoubleListTraverse();
				dtc.printFromBeg(l3);
				System.out.println();
				dtc.printFromEnd(l3);
	}

}
