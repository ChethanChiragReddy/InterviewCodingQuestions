package com.chethan.programming;

/**
 * @author Chethan Chirag Reddy
 *
 */
public class CycleDetectionInLinkedlist {
	
	
	class SinglyLinkedListNode{
		int data;
	    SinglyLinkedListNode next;
	}
	
	public static boolean hasCycle(SinglyLinkedListNode head){
		if(head == null) return false;
		SinglyLinkedListNode slow,fast;
		
		slow = head;
		fast = head;
		
		while(fast!=null &slow!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) return true;
		}
		return false;
	}

}
