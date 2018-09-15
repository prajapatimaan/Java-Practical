import java.util.*;
 class Atm
{
         //private String accountNumber, firstName, lastName;         
         public double accountBalance;
         Atm(double balance)
         {
            accountBalance=balance;
         }
         public double getBalance()
         {
          return accountBalance;
         }
}
class Account
{
    public static void main(String ar[])
    {
        Atm a1=new Atm(2000.00);
        a1.getBalance();
        
        //Atm a2=new Atm(3000.00);
        // a2.getBalance();
        //double balance=a1.accountBalance;
        //System.out.println("balance:"+ balance);

    }
}