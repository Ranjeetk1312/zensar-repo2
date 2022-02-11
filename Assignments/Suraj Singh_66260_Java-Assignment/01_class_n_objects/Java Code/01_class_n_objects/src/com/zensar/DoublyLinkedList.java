package com.zensar;

public class DoublyLinkedList {
	
	Node head,tail = null;
		class Node
		{
			int data;
			Node prev;
			Node next;
			
			Node(int d)
			{
				data = d;
			}
		}
		
		
		void insert(int data)
		{
			Node new_node = new Node(data);
			
			if(head==null)
			{
				head = tail = new_node;
				head.prev = null;
				tail.next = null;
			}
			
			tail.next = new_node;
			new_node.prev = tail;
			tail = new_node;
			new_node.next = null;
			
			
			
		}
		
		void delete(Node del)
		{
			if(head == null ) 
			{
	            return;
	        }
			
	        
	        if(head == del) {
	            head = del.next;
	        }
	 
	        
	        
	        if(del.next != null) {
	            del.next.prev = del.prev;
	        }
	 
	        
	        
	        if(del.prev != null) {
	            del.prev.next = del.next;
	        }
	 
	        
	        return;
			
		}
		
		
		void printNodes()
		{
			Node curr = head;
			if(head == null)
			{
				System.out.println("DLL is empty");
				return;
			}
			
			while(curr!=null)
			{
				System.out.print(curr.data + "->" );
				
				curr = curr.next;
			}
			System.out.println(" ");
		}
		
}


