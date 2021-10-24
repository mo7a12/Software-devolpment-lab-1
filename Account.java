
package lab12;

/**
 *
 * @author sameeh boshra
 */
public class Account {

    
    private int id =0 ;
    private double balance =0.0 ;
    private double annualInterestRate =0.0;
    private java.util.Date datacreated;
     
    public  Account ()
    {
       datacreated =new java.util.Date();
    }
    public Account (int id ,double balance)
    {
        this();
        this.id=id;
        this.balance=balance;
    }
    
    public int getId()
    {
        return this.id;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }
    public String getDataCreated()
    {
        return this.datacreated.toString();
    }
    public void setId(int id)
    {
        this.id=id;
    }
    
    public void setBalance(double balance)
    {
        this.balance=balance;
        
    }
    public void setAnnualInterestRate(double annulInterestRate)
    {
        this.annualInterestRate=annulInterestRate;
    }
    public double getmonthlyInterestRate()
    {
        return (annualInterestRate / 100) / 12;
    }
    public  double getmonthlyInterest()
    {
        return balance*getAnnualInterestRate();
    }
    
    public void withdraw (double amount )
    {
      this.balance -=amount;  
    }  
    public void deposit(double amount)
    {
        this.balance+=amount;
    }
    public  void print ()
    {
        System.out.println(
                " Balance : " + balance + "\n"+
                " monthly interest : " +getmonthlyInterest() +"\n"+
                " Data created :  " +getDataCreated());
    }
}
