import java.util.*;
class  num extends Thread
{   
    String s;
    int number;
    num(String name,int no)
    {
        start();
        s=name;
        number=no;
    }
    public void run()
    {
        try{
             System.out.println(s+":"+ number);
             Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
    }


}
class pract_24
{
    public static void main(String ar[])
    {
        for(int i=1;i<=10;i++)
        {
                if(i%2==0)
                {
                    num n=new num("odd no:",i);
               
            
                }
                else{
                    num n1=new num("even no:",i); 
                    
                }
        
        }
        
    }
}