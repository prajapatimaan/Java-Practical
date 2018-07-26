class a
{	
	int a=10;
	void a1()
	{
		System.out.println("a is :"+a);
	}	
}
class b
{
	int b=20;
	void b1()
	{
		System.out.println("b is:" +b);
	}
}
class c extends a,b
{
	int c=30;
	void c1()
	{
		System.out.println("c is :"+c);
	}
}
class d extends c
{
	int d=40;
	void d1()
	{
		System.out.println("d is:"+d);
	}
	
}
class prac10
{
	public static void main(String ar[])
	{
		d t1=new d();
		t1.d1();
		t1.c1();
		t1.b1();
		t1.a1();
	}	
}