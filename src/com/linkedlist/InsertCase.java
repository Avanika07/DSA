package com.linkedlist;

public class InsertCase {
	
	public void traverseFromBeg(DoubleListNode node) {
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
	
	public void traverseFromEnd(DoubleListNode node) {
		while(node.next!=null) {
			node=node.next;
		}
		
		//print reverse
		while(node!=null) {
			System.out.print(node.val+"->");
			node=node.prev;
		}
	}
	
	//insert at begin
	public DoubleListNode insertAtBeg(DoubleListNode node,int valToInsert) {
			while(node.prev!=null) {
				node=node.prev;
			}
			
			DoubleListNode newNode=new DoubleListNode(valToInsert);
			newNode.next=node;
			node.prev=newNode;
			return newNode;
	}
	
	//insert at end
	public void insertAtEnd(DoubleListNode node,int valToInsert) {
		while(node.next!=null) {
			node=node.next;
		}
		
		DoubleListNode newNode=new DoubleListNode(valToInsert);
		node.next=newNode;
		newNode.prev=node;
	}
	
	//insert at position
	public void insertAtPos(DoubleListNode node,int valToInsert,int pos) {
		while(node.prev!=null) {
			node=node.prev;
		}
		for(int i=1;i<pos;i++) {
			node=node.next;
		}
		
		DoubleListNode newNode=new DoubleListNode(valToInsert);
		newNode.prev=node;
		newNode.next=node.next;
		node.next.prev=newNode;
		node.next=newNode;
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
				
			    InsertCase ic=new InsertCase();
			    ic.traverseFromBeg(l3);
			    System.out.println();
			    ic.traverseFromEnd(l3);
			    
			    System.out.println();
			    
			    DoubleListNode nn=ic.insertAtBeg(l3, 67);
			    ic.traverseFromBeg(l3);
			    System.out.println();
			    
			    ic.insertAtEnd(l2, 77);
			    ic.traverseFromBeg(l3);
			    System.out.println();
			    
			    ic.insertAtPos(l2, 44, 3);
			    ic.traverseFromBeg(l3);
	}

}
