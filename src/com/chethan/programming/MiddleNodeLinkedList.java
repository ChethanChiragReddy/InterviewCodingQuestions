package com.chethan.programming;

public class MiddleNodeLinkedList {
	
	
    Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	void push(int data){
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
	}
	
	
	void printlist(){
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.data + "");
			temp = temp.next;
		}
		System.out.println();
	}
		
	
	
	public static void main(String[] args) {
	
		MiddleNodeLinkedList linkedList = new MiddleNodeLinkedList();
		for (int i = 60; i >= 10; i -= 10) 
			linkedList.push(i);
		
		   linkedList.printlist();
		
	   }
	
}