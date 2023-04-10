public class Bank {
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount(1000, "Michael");
        System.out.println(myAccount.inquiry());
        myAccount.deposit(505.22);
        System.out.println(myAccount.inquiry());
        myAccount.withdraw(100);
        System.out.println(myAccount.inquiry());
    }
}

class BankAccount {
    private double balance;
    private String name;
    public BankAccount(double startingBalance, String inputName){
        this.balance = startingBalance;
        this.name = inputName;
    }
    public double balance(){
        return this.balance;
    }
    public String name(){
        return this.name;
    }
    public void deposit(double inputDepositAmount){
        this.balance+=inputDepositAmount;
    }
    public void withdraw(double inputWithdrawAmount){
        this.balance-=inputWithdrawAmount;
    }
    public String inquiry(){
        return "The "+ this.name+" account balance is "+this.balance;
    }
}