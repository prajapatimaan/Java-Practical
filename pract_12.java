import java.util.*;
class pract_12
{
	public static void main(String ar[])
	{
		int[] a=new int[4];
		int sum=0;
		//int[] b=new int[4];
		System.out.println("Enter Array value:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		double avg=sum/4;
		System.out.println(avg);
	}
}