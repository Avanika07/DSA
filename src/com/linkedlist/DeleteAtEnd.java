package com.linkedlist;

public class DeleteAtEnd {
		
		public ListNode deleteAtEnd(ListNode head) {
			ListNode ptr=head;
			while(ptr.next.next!=null) {
				ptr=ptr.next;
			}
			ptr.next=null;
			return head;
		}
		
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
			
			DeleteAtEnd d=new DeleteAtEnd();
			System.out.println("----- before deletion ---------");
			ListNode head=l1;
			d.traverse(head);
			System.out.println();
			System.out.println("-----after deletion --------");
			head=d.deleteAtEnd(head);
			d.traverse(head);
		}

	}

