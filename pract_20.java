interface p
{
	int p=10;
	 void printp();
}
interface p1 extends p
{
	int p1=20;
	 void printp1();
}
interface p2 extends p
{
	int p2=30;
	 void printp2();
}
interface p12 extends p1,p2
{
	int p12=40;
	 void printp12();
}
class Q implements p12
{
	public void printp()
	{
		System.out.println("interface p of variable p value:"+ p);
	}
	 public void printp1()
	{
		System.out.println("interface p1 of variable p1 value:"+ p1);
	}
	public void printp2()
	{
		System.out.println("interface p2 of variable p2 value:"+ p2);
	}
	public void printp12()
	{
		System.out.println("interface p12 of variable p12 value:"+ p12);
	}
}
class pract_20
{
	public static void main(String ar[])
	{
		Q q1=new Q();
		q1.printp();
		q1.printp1();
		q1.printp2();
		q1.printp12();
	}
}