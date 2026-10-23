package com.linkedlist;

public class Traverse {
		
		public void traverse(ListNode head) {
			ListNode ptr=head;
			while(ptr!=null) {
				System.out.print(ptr.val+"->");
				ptr=ptr.next;
			}
		}
		
		
		public static void main(String args[]) {
			//creating nodes
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
			Traverse t=new Traverse();
			t.traverse(head);
		}

	}

