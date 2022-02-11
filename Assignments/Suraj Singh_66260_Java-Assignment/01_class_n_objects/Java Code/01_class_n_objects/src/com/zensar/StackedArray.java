package com.zensar;

public class StackedArray {
	private int n = 100;
	private int[] arr = new int[n];
	private int top = -1;
	
	
	public void push(int value)
	{
		
		if(top == n)
		{
			System.out.println("Stack Overflow because stack is full now ");
			return;
		}
		++top;
		arr[top] = value;
	}
	
	public void pull()
	{
		if(top < 0)
		{
			System.out.println("Stack Underflow because Stack is empty already");
			top = -1;
			return;
		}
		arr[top] = 0;
		--top;
		
	}
	
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(arr[i] + " ");
		}
		if(top < 0)
		{
			System.out.println("Stack is empty.");
		}
		System.out.println();
	}
	
}
