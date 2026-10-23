package com.linkedlist;

public class ReverseLinkedList {

	public ListNode reverseWithsp(ListNode head) {
		//edge cases
		if(head==null) {
			return null;
		}
		if(head.next==null) {
			return head;
		}
		ListNode preNode=null;
		ListNode curNode=head;
		
		while(curNode!=null) {
			ListNode nextNode=curNode.next;
			curNode.next=preNode;
			preNode=curNode;
			curNode=nextNode;
		}
		head=preNode;
		return head;
	}
	
	public void traverse(ListNode head) {
		ListNode ptr=head;
		while(ptr!=null) {
			System.out.print(ptr.val+"->");
			ptr=ptr.next;
		}
	}
	
	public static void main(String[] args) {
		//creation of nodes
		ListNode l1=new ListNode(10);
		ListNode l2=new ListNode(20);
		ListNode l3=new ListNode(30);
		ListNode l4=new ListNode(40);
		ListNode l5=new ListNode(50);
		
		//connecting the nodes
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=null;
		
		ListNode head=l1;
		ReverseLinkedList rl=new ReverseLinkedList();
		System.out.println("------original linked list------");
		rl.traverse(head);
		
		System.out.println();
		System.out.println("------reverse linked list------");
		head=rl.reverseWithsp(head);
		rl.traverse(head);
		
	}
}
