class Cons
{
	Cons()
	{
		int x=10;
		System.out.println("X :" + x);

	}
	Cons(int a,int b)
	{
		int p=a;
		int q=b;
		System.out.println("P :" + p + "Q :" + q);
	}
	void mul()
	{
		int ans=10*20;
		System.out.println("Multiply of simple constructor value:"+ans);
	}
	void mul(int m,int n)
	{
		int ans=m*n;
		System.out.println("Multiply of parameterized Constructor:"+ ans);
	}

}
class p2
{
	public static void main(String ar[])
	{
		Cons c1=new Cons();
		Cons c2=new Cons(30,50);
		c1.mul();
		c2.mul(20,50);
		
	}
}