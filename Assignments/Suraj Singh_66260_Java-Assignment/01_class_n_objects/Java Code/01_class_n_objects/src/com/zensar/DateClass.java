package com.zensar;

public class DateClass {
	private int day;
	private String month;
	private int year;
	
	public DateClass(){
		day = 0;
		month = null;
		year = 0;
	}

	public DateClass(int day, String month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void SwapTwoDates(DateClass obj)
	{
		int day_Of_Current_Object,  year_Of_Current_Object;
		String month_Of_Current_Object;
		day_Of_Current_Object = this.day;
		month_Of_Current_Object = this.month;
		year_Of_Current_Object = this.year;
		this.day = obj.day;
		this.month = obj.month;
		this.year = obj.year;
		obj.day = day_Of_Current_Object;
		obj.month = month_Of_Current_Object;
		obj.year = year_Of_Current_Object;
		
	}
}
