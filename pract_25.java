class display implements Runnable
{
    String msg;
    display(String n)
    {
    
        msg=n;
    }
    public void run()
    {
        try
        {
            if(msg=="Good Morning")
            {
                System.out.println(msg);
                 Thread.sleep(1000);
            }
            else if(msg=="Good Night")
            {
                System.out.println(msg);
            Thread.sleep(3000);
            }
            
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}
class pract_25
    {
    public static void main(String ar[])
    {
        display p=new display("Good Morning");
         Thread t=new Thread(p);
        t.start();
        display p1=new display("Good Night");
         Thread t1=new Thread(p1);
        t1.start();
       
    }
}