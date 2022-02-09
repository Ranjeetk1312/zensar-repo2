package com.zensar;

public class Stack 
{
	int n = 100;
	int arr[] = new int[n];
	int top = -1;
	
	void push(int value)
	{
		if(top == (n-1))
			System.out.println("stack is full");
		
		arr[top+1] = value;
		top++;
	}
	
	void pop()
	{
		if(top < 0)
			System.out.println("stack is empty");
		
		top = top-1;
	}
	
	void display()
	{
		for(int i = 0; i<=top ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(25);
		s.push(200);
		s.push(45);
		s.push(36);
		s.push(15);
		s.push(99);
		s.display();
		
		System.out.println("After pop");
		s.pop();
		s.display();
		
			
	}


}

