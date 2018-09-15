import java.util.*;
class positive extends Exception{}
class pract_22 
{
		void check(int number) throws positive{
				if(number<=0){
					positive p1=new positive();
					throw p1;
				}
				else{
					System.out.println("NUmber is Positive:"+number);
				}
		}
	public static void main(String ar[])
	{
		pract_22 p=new pract_22();
			try{
			 int no=Integer.parseInt(ar[0]);
			 p.check(no);
				}catch(Exception e)
				{
					System.out.println("Please Enter Positive number!!");
				}

			
	}
}