class parent
{
	void sum(int x,int y)
 	{
 		int a=x;
 		int b=y;
 		int ans= a+b;
 		System.out.println("parent class sum is: " +ans);
 	}
}
class child extends parent
{

	void sum(int x,int y)
	{
		super.sum(50,60);
		int a=x;
 		int b=y;
		
 		int ans= a+b;
 		System.out.println("child class sum is: " +ans);
	}
}
class pract_18
{
	public static void main(String ar[])
	{
		child c=new child();
		c.sum(10,20);
	}
}