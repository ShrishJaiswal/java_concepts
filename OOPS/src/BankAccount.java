public class BankAccount {

    int accountNumber;
    String accountHolderName;
    double accountBalance;

    public BankAccount(int accountNumber, String accountHolderName, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public void depositCash(double accountBalance){
        this.accountBalance = this.accountBalance + accountBalance;
    }

    public void withdrawCash(double accountBalance){
        this.accountBalance = this.accountBalance - accountBalance;
    }

    public void displayInformation(){
        System.out.println("Hello, "+this.accountHolderName+"! with account number: "+this.accountNumber+" your current balance is: "+this.accountBalance);
    }
}