package com.zensar;

public class ComplexNumber {
	private int real_number;
	private int imaginary_number;
	
	
	
	public ComplexNumber(int real_number, int imaginary_number) {
		super();
		this.real_number = real_number;
		this.imaginary_number = imaginary_number;
	}

	public void Add(ComplexNumber obj)
	{
		this.real_number += obj.real_number;
		this.imaginary_number += obj.imaginary_number;
	}
	
	public void Substract(ComplexNumber obj)
	{
		this.real_number -= obj.real_number;
		this.imaginary_number -= obj.imaginary_number;
	}
	
	public void Multiple(ComplexNumber obj)
	{
		int real_number_for_an_object = 0, imaginary_number_for_an_object = 0;
		boolean negative = false;
		if(this.imaginary_number < 0 && obj.imaginary_number < 0)
			 negative = true;
			
		real_number_for_an_object = (this.real_number * obj.real_number) + ((negative == true)?((-1) * this.imaginary_number * obj.imaginary_number): this.imaginary_number * obj.imaginary_number);
		imaginary_number_for_an_object =(this.real_number * obj.imaginary_number) + (this.imaginary_number * obj.real_number);
		this.real_number = real_number_for_an_object;
		this.imaginary_number = imaginary_number_for_an_object;
	}
	
	public void Swap(ComplexNumber obj)
	{
		int real_number_for_an_object = 0, imaginary_number_for_an_object = 0;
		real_number_for_an_object = this.real_number;
	    imaginary_number_for_an_object = this.imaginary_number;
	    this.real_number = obj.real_number;
	    this.imaginary_number = obj.imaginary_number;
	    obj.real_number = real_number_for_an_object;
	    obj.imaginary_number = imaginary_number_for_an_object;
	}
	
	public void display()
	{
		if(this.imaginary_number > 0)
			System.out.println("The Complex number is : " + this.real_number + "+" + this.imaginary_number+"i");
		
		else
			System.out.println("The Complex number is : " + this.real_number + this.imaginary_number+"i");
	}
	
}
