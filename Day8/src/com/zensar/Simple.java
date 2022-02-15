package com.zensar;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b[] = { 4, 3, 6, 7, 1 };
		try {
			System.out.println("Entered in try block");
			System.out.println(b[5]);
			System.out.println(a / 0); // This line will throw a run-time exception called "Artihmetic Exception"
			System.out.println("No problem");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			// TODO: handle exception
			// It's a costlier process - If a process consumes more power/time to run it is
			// called costlier process
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block");
		}

		System.out.println("Program Ends Here");
	}

}
