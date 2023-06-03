public class SavingsAccount extends BankAccount{
    protected double insterestrate;
    protected double  RATE ;


    public SavingsAccount(){
        insterestrate=0.25;
    }
    public SavingsAccount(double RATE, double balance){
        super(balance);
        this.RATE=0.023;
    }

    public void addCompoundInterest(){
        double interest=getBalance()*insterestrate;
        deposit(interest);
    }


}
