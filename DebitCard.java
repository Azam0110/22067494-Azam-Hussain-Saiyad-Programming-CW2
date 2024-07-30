
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067494 Azam Hussain Saiyad)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    //attributes
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //constructor
    public DebitCard(double balanceAmount,int cardId,String bankAccount,String issuerBank,String clientName,int pinNumber){
       super(balanceAmount,cardId,bankAccount,issuerBank);
       super.setClientName(clientName);
       this.pinNumber = pinNumber;
       this.hasWithdrawn = false;
    }
    
    //accessor method for each attribute
    public int getPinNumber(){
        return this.pinNumber;
    }
    
    public int getWithdrawalAmount(){
        return this.withdrawalAmount;
    }
    
    public String getDateOfWithdrawal(){
        return this.dateOfWithdrawal;
    }
    
    public boolean getHasWithdrawn(){
        return this.hasWithdrawn;
    }
    
    //mutator method for withdrawalAmount
    public void setWithdrawalAmount(int withdrawalAmount){
        this.withdrawalAmount = withdrawalAmount;
    }
    
    //method for withdraw
    public void withdraw(int withdrawalAmount,String dateOfWithdrawal,int pinNumber){
        //check if the pin number is same or not
        if(pinNumber == this.pinNumber){
            //check if the withdrawal amount is less or equal to balance amount
            if(withdrawalAmount<=super.getBalanceAmount()){
                // deducts the withdrawal amount from balance amount and store in a variable
                double newbalanceAmount = super.getBalanceAmount() - withdrawalAmount;
                // set new balance amount in super class
                super.setBalanceAmount(newbalanceAmount);
                this.hasWithdrawn = true;
                this.withdrawalAmount = withdrawalAmount;
                this.dateOfWithdrawal = dateOfWithdrawal;
                System.out.println("Transcation Successfull! Remaining Balance is : " + super.getBalanceAmount());
            }else{
                System.out.println("Insufficient Balance!! Please try again.");
            }
        }else{
            System.out.println("PIN number is invalid");
        }
    }
    
    //method for diplay
    public void display(){
        // display the super class
        super.display();
        System.out.println("PIN Number " + this.pinNumber);
        //check if the transaction was successful or not
        if(hasWithdrawn == true){
            System.out.println("Withdrawal Amount " + this.withdrawalAmount);
            System.out.println("Date of Withdrawal " + this.dateOfWithdrawal);
        }else{
            System.out.println("Transaction Successful. Balance : " + super.getBalanceAmount());
        }
    }
}