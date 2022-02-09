package day4Assignments;

public class ComplexNumbers 
{
	
	int real = 5,img = 3;
	
	 void add(int real,int img)
	{
		System.out.println(this.real+real + "  " + this.img+img);
	}
	 
	 void sub(int real,int img)
		{
			System.out.println((this.real-real) + "  " + (this.img-img));
		}
	 
	 void mul(int real,int img)
		{
			System.out.println(this.real*real + "  " + this.img*img);
		}
	 
	 void div(int real,int img)
		{
			System.out.println(this.real/real + "  " + this.img/img);
		}
	 
	 
	 
	public static void main(String[] args) 
	{
		ComplexNumbers c = new ComplexNumbers();
		c.add(6, 8);
		c.sub(4, 7);
		c.div(3, 7);
		c.mul(9, 17);
	}
}






































