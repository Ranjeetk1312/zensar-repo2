package com.zensar;

public class Date {
	private int day;
	private int month;
	private int year;
	private Date date1;
	private Date date2;

	public Date(int day, int month, int year) {
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

	@Override
	public String toString() {
		return (day + "-" + month + "-" + year);
	}

	public void swapDates(Date date1, Date date2) {
		this.date1 = date1;
		this.date2 = date2;
		System.out.println("Before Swap ---- date1=" + this.date1 + "date2=" + this.date2);

		this.date1 = date2;
		this.date2 = date1;
		System.out.println("After Swap ---- date1=" + this.date1 + "date2=" + this.date2);
	}

}
