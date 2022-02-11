package com.zensar;

public class QueuedArray {
	private int n = 100;
	private int[] arr = new int[n];
	private int enqueue = -1 , dequeue = -1;
	
	
	public void push(int value)
	{
		
		if(enqueue == n)
		{
			System.out.println("Stack Overflow because stack is full now ");
			return;
		}
		++enqueue;
		arr[enqueue] = value;
	}
	
	public void pull()
	{
		if(enqueue == dequeue)
		{
			System.out.println("Stack Underflow because Stack is empty already");
			dequeue = -1;
			return;
		}
		++dequeue;
		System.out.print(arr[dequeue] + " ");
		arr[dequeue] = 0;
	}
	
	public void display()
	{
		for(int i=0;i<=enqueue;i++)
		{
			System.out.print(arr[i] + " ");
		}
		if(enqueue < 0)
		{
			System.out.println("Stack is empty.");
		}
		System.out.println();
	}
}
