package com.zensar;

public class class_n_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//Creating objects
		DateClass dateObject = new DateClass();
		DateClass dateObject1 = new DateClass();
		
		//With Set Method Setting Day, Month, Year
		dateObject.setDay(9);
		dateObject.setMonth("Feb");
		dateObject.setYear(2022);
			
		// Printing Day, Month, Year
		System.out.println("The Date is : " + dateObject.getDay() + "/"+ dateObject.getMonth()+ "/" + dateObject.getYear());
		
		//With Set Method Setting Day, Month, Year
		dateObject1.setDay(11);
		dateObject1.setMonth("Jan");
		dateObject1.setYear(2022);
		
		// Printing Day, Month, Year
		System.out.println("The Date is : " + dateObject1.getDay() + "/" + dateObject1.getMonth() +  "/" + dateObject1.getYear());
		
		//Swapping two objects properties by calling SwapTwoDates Method
		dateObject1.SwapTwoDates(dateObject);
		
		//Printing out Day,Month,Year for dateObject
		System.out.println("The Date is : " + dateObject.getDay() + "/" + dateObject.getMonth() + "/" + dateObject.getYear());
		//Printing out Day,Month,Year for dateObject1
		System.out.println("The Date is : " + dateObject1.getDay() + "/" + dateObject1.getMonth() + "/" + dateObject1.getYear());
		
		
		//Creating objects
		ComplexNumber complexnumber_1 = new ComplexNumber(4,-7);
		ComplexNumber complexnumber_2 = new ComplexNumber(7,5);
		
		//Printing out complexnumber_1 properties
		complexnumber_1.display();
		
		//Printing out complexnumber_2 properties
	    complexnumber_2.display();
	    
	    //Adding complexnumber_1 with complexnumber_2
	    complexnumber_1.Add(complexnumber_2);
	    
	  //Printing out complexnumber_1 properties
	    complexnumber_1.display();
	    
	    complexnumber_1.Multiple(complexnumber_2);
	    
	  //Printing out complexnumber_1 properties
	  		complexnumber_1.display();
	  
		
		//Creating objects
		Account accountObject = new Account(14000);
		
		//Displaying balance in account
		accountObject.display();
		
		//Displaying balance in account after getting amount from deposit function
		accountObject.display(accountObject.deposit(5000));
		
		//Displaying balance in account after getting amount from withdraw function
		accountObject.display(accountObject.withdraw(10000));
		
		
		
		//Creating objects;
		StackedArray stackObject = new StackedArray();
		
		stackObject.push(9);
		System.out.println("After Pushing Elements Into Stack");
		stackObject.display();
		

		System.out.println("After Pulling out Elements from Stack");
		System.out.println();
		stackObject.pull();
		stackObject.pull();
		stackObject.display();
		
		stackObject.push(7);
		stackObject.push(10);
		stackObject.push(19);
		stackObject.push(32);
		stackObject.push(78);
		System.out.println("After Pushing Elements Into Stack");
		stackObject.display();

		stackObject.pull();
		stackObject.pull();
		stackObject.pull();
		System.out.println("After Pulling out Elements from Stack");
		stackObject.display();
		
		
		
		//Creating objects
        QueuedArray queueObject = new QueuedArray();
		//Adding Element in Queue 
        queueObject.push(9);
		System.out.println("After Pushing Elements Into Queue");
		queueObject.display();
		
		
		System.out.println("After Pulling out Elements from Queue");
		//Pull out Elements from Queue
		queueObject.pull();
		System.out.println();
		queueObject.pull();
		//Displaying Available Element in Queue
		queueObject.display();
		//Adding Elements into Queue
		queueObject.push(7);
		queueObject.push(10);
		queueObject.push(19);
		queueObject.push(32);
		queueObject.push(78);
		System.out.println("After Pushing Elements Into Queue");
		queueObject.display();

		//Removing Elements from Queue
		queueObject.pull();
		queueObject.pull();
		queueObject.pull();
		System.out.println();
		System.out.println("After Pulling out Elements from Queue");
		queueObject.display();
		*/
		
		//creating objects for singletonClass
		SingletonClass singletonReference_1 = SingletonClass.getInstance();
		singletonReference_1.str = "This is singletonReference_1";
		
		SingletonClass singletonReference_2 = SingletonClass.getInstance();
		singletonReference_2.str = "This is singletonReference_2";
		
		SingletonClass singletonReference_3 = SingletonClass.getInstance();
		singletonReference_3.str = "This is singletonReference_3";
		
		System.out.println(singletonReference_1.str);
		System.out.println(singletonReference_2.str);
		System.out.println(singletonReference_3.str);
		
		//Creating Doubly Objects 
		DoublyLinkedList dl = new DoublyLinkedList();
		
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
