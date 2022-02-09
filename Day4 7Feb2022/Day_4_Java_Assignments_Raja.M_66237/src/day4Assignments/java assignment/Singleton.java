package day4Assignments;


public class Singleton
{
	public static void main(String[] args) {
		Example obj = Example.getObject();
		
	}
}

final class Example
{
	
	private static Example single_obj = null;
	
	public String str ;
	
	static Example obj = new Example();
	
	private Example()
	{
		str = "Demo";
	}
	
	
	public static Example getObject()
	{
		if(single_obj == null)
			single_obj = new Example();
		
		System.out.println("Singleton obj created");
		return single_obj;
	}
}