package com.zensar;

public class Queue
{
	int n = 100;
	int arr[] = new int[n];
	int rear=-1, front = 0;
	
	void enQueue(int value)
	{
		if(rear == (n-1))
			System.out.println("queue is full");
		
		arr[rear+1] = value;
		rear++;
	}
	
	void deQueue()
	{
		if(rear == front)
			System.out.println("queue is empty");
		
		for(int i=0;i<=rear;i++)
			arr[i] = arr[i+1];
		
		--rear;
		
	}
	
	void display()
	{
		for(int i = 0; i<=rear ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Queue s = new Queue();
		s.enQueue(25);
		s.enQueue(200);
		s.enQueue(45);
		s.enQueue(36);
		s.enQueue(15);
		s.enQueue(99);
		s.display();
		
		System.out.println("After deQueue");
		s.deQueue();
		s.display();
			
	}
	
}
