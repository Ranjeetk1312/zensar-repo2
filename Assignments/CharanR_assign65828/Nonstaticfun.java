package project01;
import java.util.Scanner;
public class Nonstaticfun {
void min(int a,int b) //formal parameters
{
	if(a>b)
		System.out.println(a+" "+"is max");
	else
		System.out.println(b+" "+"is max");
}
	
	public static void main(String[] args) {
		Nonstaticfun obj=new Nonstaticfun();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 no's");
		int c=sc.nextInt();
		int d=sc.nextInt();
		obj.min(c, d);//actual parameters
	}

}
