package com.chethan.programming;

/**
 * @author CHETHAN CHIRAG REDDY
 *
 */
public class LinkedlistRotate {
	
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
	
	
	
  public static void main(String args[]){
		
		LinkedlistRotate linkedlistRotate = new LinkedlistRotate();
		
		//create linkedlist 10->20->30->40->50->60
		for (int i = 60; i >= 10; i -= 10) 
			linkedlistRotate.push(i);
		
		 System.out.println("Given list"); 
		 linkedlistRotate.printlist();
		 
		 
		 linkedlistRotate.rotate(4);
		 
		 System.out.println("rotate  list"); 
		 linkedlistRotate.printlist();
	}
  
  
     void rotate(int K){
    	 if(K ==0) return;
    	 
    	 Node current = head;
    	 
    	 int count = 1;
    	 while(count < K && current!=null){
    		 current  = current.next;
    		 count++;
    	 }
    	 
    	 if(current == null) return;
    	 
    	 Node KthNode = current;
    	 
    	 while(current.next!=null){
    		 current = current.next;
    	 }
    	 
    	 current.next = head;
    	 
    	 head = KthNode.next;
    	 
    	 KthNode.next = null;
     }

	
}
