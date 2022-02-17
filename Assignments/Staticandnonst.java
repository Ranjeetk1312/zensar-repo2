package project01;
import java.util.Scanner;
public class Staticandnonst {
public int b;
static void charan() 
{
	System.out.println("Honda CBR started");
}
void ravi(int a)
{
	System.out.println("Honda CBR Milege"+"----"+a);
}

	public static void main(String[] args) {
		
		Staticandnonst obj=new Staticandnonst();
		int b=10;
		System.out.println(b);
		Scanner ac=new Scanner(System.in);
		int a=ac.nextInt();
		obj.charan();
		obj.ravi(a);
	}

}
