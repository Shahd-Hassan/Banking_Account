public class BankAccount {
    private double balance;
    public  int count;
    public BankAccount(){
        balance=0;
    }
    public BankAccount(double accbalan){//parameterized constructor
        balance=accbalan;
    }
    public void deposit(double balance){
        if (balance==0){
            System.out.println("The account is empty! The money is being deposited...");
        }
        this.balance+=balance;

    }
    public void withdraw(double ammtowith){
        if (balance==0){
            System.out.println("The account is empty! Cannot perform this option.");

        }
        if (balance<ammtowith){
            System.out.println("The amount to withdraw is greater the the balance! Cannot perform this operation.");

        }
        if (balance>ammtowith){
        balance-=ammtowith;
        }

    }

    public double getBalance(){
        return balance;
    }
    public void transfermoney(BankAccount otherAccount, double amount){
      if(balance==0){
          System.out.println("The account is empty cannot transfer money!");
      }
      else if (balance<amount){
          System.out.println("Cannot transfer the amount is less than the balance!");
      }
      else {
      otherAccount.deposit(amount);
      withdraw(amount);
      count++;}

    }
    public void display(){
        System.out.println("The Account Balance is: "+balance);

    }
    public  void menu(){
        System.out.println("#################<--Welcome To The Banking System-->###########");
        System.out.println();
        System.out.println("***Welcome To Your Account...!!!");
        System.out.println();
        SavingsAccount DadSavings=new SavingsAccount();
        System.out.println("The dad account before transferring money--> ");
        System.out.println("---------------------------------------------");
        DadSavings.deposit(10000);
        DadSavings.display();
        System.out.println();
        System.out.println("The Accounts after transferring money--> ");
        System.out.println("-----------------------------------------");
        DadSavings.insterestrate=0.3/100;
        CheckingAccount KidChecking=new CheckingAccount();
        DadSavings.transfermoney(KidChecking,3000);
        System.out.println("The dad's account:");
        DadSavings.display();
        System.out.println("The kid's account:");
        KidChecking.display();
        System.out.println();
//        KidChecking.withdraw(200);
//        KidChecking.withdraw(400);
//        KidChecking.withdraw(300);
//        KidChecking.withdraw(500);
//        KidChecking.withdraw(400);//More than 10 transactions
//        KidChecking.withdraw(0);
//        KidChecking.withdraw(0);
//        KidChecking.withdraw(0);
//        KidChecking.withdraw(0);
//        KidChecking.withdraw(0);
//        KidChecking.withdraw(0);
//        KidChecking.withdraw(0);


        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("Dad's Savings account: "+DadSavings.getBalance());
        System.out.println("Kid's Checking account: "+KidChecking.getBalance());
        System.out.println();
        System.out.println("The Kid's Account after Deducting the fees of transactions is--> ");
        System.out.println(KidChecking.chargefee(KidChecking.getBalance()));
        System.out.println();
        if (DadSavings.getBalance()==0){
            System.out.println("The Dad Account is Empty!");
        }
        else {
            System.out.println("The Dad's Account After Adding the interest: ");
            DadSavings.addCompoundInterest();}

        DadSavings.display();
    }

}
