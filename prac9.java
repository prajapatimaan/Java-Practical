class demo
{
	int a=10,b=20,c;
	void sum()
	{
	
	c=a+b;
	System.out.println("sum is :" + c);
	}
}
class demo1 extends demo
{	
	int x=5,y=20,z;
	void mul()
	{
		super.sum();
		z=x*y;
		System.out.println("MUl is:"+z);
	}
}
class prac9
{
	public static void main(String ar[])
	{
		demo1 d1=new demo1();
		d1.mul();
	}
}