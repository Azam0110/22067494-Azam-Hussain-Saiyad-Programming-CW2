
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067494 Azam Hussain Saiyad)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    // attributes
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    //constructor
    public CreditCard(int cardId,String clientName,String issuerBank,String bankAccount,double balanceAmount,int cvcNumber,
                      double interestRate,String expirationDate){
        // assign the attributes of super class                  
        super(balanceAmount,cardId,bankAccount,issuerBank);
        // set the client name in super class
        super.setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
    //accessor method
    public int getCvcNumber(){
        return this.cvcNumber;
    }
    
    public double getCreditLimit(){
        return this.creditLimit;
    }
    
    public double getInterestRate(){
        return this.interestRate;
    }
    
    public String getExpirationDate(){
        return this.expirationDate;
    }
    
    public int getGracePeriod(){
        return this.gracePeriod;
    }
    
    public boolean getIsGranted(){
        return this.isGranted;
    }
    
    // method to set the credit limit
    public void setCreditLimit(double newcreditLimit, int newgracePeriod){
        this.creditLimit = newcreditLimit;
        this.gracePeriod = newgracePeriod;
        // credit limit should be less or equal to 2.5 times the balance amount of super class
        if(newcreditLimit <= 2.5*super.getBalanceAmount()){
            this.isGranted = true;
            System.out.println("Credit Card has been granted Successfully!");
        }else{
            System.out.println("Credit Card is not Granted");
        }
    }
    
    // method to cancel the Credit Card
    public void cancelCreditCard(){
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }
    
    // method to display the details
    public void display(){
        // display the super class diplay ()
        super.display();
        System.out.println("CVC number: " + this.cvcNumber);
        System.out.println("Interest rate: " + this.interestRate);
        System.out.println("Expiration date: " + this.expirationDate);
        // check if is garnted is true
        if(isGranted == true){
            System.out.println("Credit limit: " + this.creditLimit);
            System.out.println("Grace period: " + this.gracePeriod);
        }
        else{
            System.out.println("Credit Card has not been granted.");
        }
    }
}
