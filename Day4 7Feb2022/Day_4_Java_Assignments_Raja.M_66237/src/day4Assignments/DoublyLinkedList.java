package day4Assignments;


class DLLImpl
{
	
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

public class DoublyLinkedList 
{
	public static void main(String[] args) {
		DLLImpl dl = new DLLImpl();
		
		dl.insert(10);  
        dl.insert(20);  
        dl.insert(30);  
        dl.insert(40);  
        dl.insert(50);  
        
        
        dl.printNodes();
        
        dl.delete(dl.head.next);
        dl.delete(dl.tail.prev);

        
        System.out.println("after deletion");
        dl.printNodes();

        
        
		
	}
}
