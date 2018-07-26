import java.util.*;
class indiatousd
{
	public static void main(String ar[])
	{
		double in,usd;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Ruppes Convert into Dollar:");
		in=sc.nextInt();
		usd=in/60;
		System.out.println("IN Doller:" + usd);
	}
}