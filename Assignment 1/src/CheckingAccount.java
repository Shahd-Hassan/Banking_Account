public class CheckingAccount extends BankAccount {
    private static final int ALLOWED_TRANS = 2;
    private static final int TRANS_FEE = 3;

    public int transactioncount;


    CheckingAccount() {



    }

    CheckingAccount(double abal) {
        deposit(abal);
    }

    @Override
    public void deposit(double balance) {
        super.deposit(balance);
        if (getBalance()==0){
            System.out.println("The Account is empty");
        }
        else if (transactioncount>10){
            System.out.println("Cannot make more than 10 transactions!!!");
        }
        else {
        transactioncount++;}
    }

    @Override
    public void withdraw(double ammtowith) {
        super.withdraw(ammtowith);
        if (getBalance()==0){
            System.out.println("The Account is empty");
        }
        else if (transactioncount>10){
            System.out.println("Cannot make more than 10 transactions!!!");
        }
        else {
        transactioncount++;}
    }

    public double chargefee(double kid){

        if (transactioncount>ALLOWED_TRANS){
            transactioncount-=2;
            kid-=transactioncount*TRANS_FEE;

        }
         return kid;
    }

}
