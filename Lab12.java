
package lab12;

/**
 *
 * @author sameeh boshra
 */
public class Lab12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account a =new Account(1122,20000.0);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);
        a.print();
    }
    
}
