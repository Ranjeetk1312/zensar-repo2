package com.zensar;

public class Date
{
	int day,month,year;
	
	Date()
	{
		//default
	}
	
	Date(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	void printDate(int day,int month,int year)
	{
		System.out.println(day + " " + month + " " + year);
	}
	
public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


}


class Date_1 
{

	public static void main(String[] args)
	{
		
		Date x = new Date();
		
		x.printDate(04, 02, 2022);

	}

}

