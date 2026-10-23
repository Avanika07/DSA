package com.linkedlist;

public class DeleteAtPos {
		
		public ListNode deleteAtPos(ListNode head,int pos) {
			ListNode ptr=head;
			for(int i=1;i<pos-1;i++) {
				ptr=ptr.next;
			}
			ListNode nodedelete=ptr.next;
			ListNode nextNode=nodedelete.next;
			ptr.next=nextNode;
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
					
					DeleteAtPos dp=new DeleteAtPos();
					System.out.println("----- before deletion ---------");
					ListNode head=l1;
					dp.traverse(head);
					
					System.out.println();
					
					System.out.println("-----after deletion --------");
					head=dp.deleteAtPos(head,3);
					dp.traverse(head);
				
		}
	}

