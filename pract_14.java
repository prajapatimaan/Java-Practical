import java.util.*;
class method
{
	void add(int x,int y)
	{
		int sum=x+y;
		System.out.println("addition is:" + sum);
	}
	void sub(int x,int y)
	{
		int sub=x-y;
		System.out.println("subtraction is:" + sub);
	}
	void mul(int x,int y)
	{
		int mul=x*y;
		System.out.println("MUltiplication is:" + mul);
	}
	void div(int x,int y)
	{
		int div=x/y;
		System.out.println("Division is:" + div);
	}
}
class pract_14
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("ENter Your Choice:");
		System.out.println("1. Addition!!");
		System.out.println("2. subtraction!!");
		System.out.println("3. Multipication!!:");
		System.out.println("4. Division!!");
		System.out.println("5. Exit..!!");
		method m1=new method();
		int ch=sc.nextInt();
int a,b;
		switch(ch)
		{
			case 1:
				System.out.println("ENter 2 no:");
				 a=sc.nextInt();
				 b=sc.nextInt();
				m1.add(a,b);
				break;
			case 2:
				System.out.println("ENter 2 no:");
				 a=sc.nextInt();
				 b=sc.nextInt();
				m1.sub(a,b);
				break;
			case 3:
				System.out.println("ENter 2 no:");
				 a=sc.nextInt();
				 b=sc.nextInt();
				m1.mul(a,b);
				break;
			case 4:
				System.out.println("ENter 2 no:");
				 a=sc.nextInt();
				 b=sc.nextInt();
				m1.div(a,b);
				break;
			case 5:
					return;
			default:
				System.out.println("Please ENter Right Choice");
				break;


		}
	}

}