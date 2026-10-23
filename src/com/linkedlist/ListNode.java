package com.linkedlist;

public class ListNode {
		
		int val;
		ListNode next;
		
		//constructor for storing values
		public ListNode(int x) {
			this.val=x;
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
			
			ListNode ptr=l1;//starts traversing from l1 node
			while(ptr!=null) {
				System.out.print(ptr.val+"->");
				ptr=ptr.next;
			}
			
		}

	}

