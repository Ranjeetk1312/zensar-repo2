package day4Assignments;

class DateImpl
{
	int day,month,year;
	
	DateImpl()
	{
		//default
	}
	
	DateImpl(int day,int month,int year)
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

public class Date {

	public static void main(String[] args) {
		
		DateImpl a = new DateImpl();
		
		a.printDate(04, 06, 2021);

	}

}
