package entities;

public class Account {
    private String name;
    private int accountNumber;
    private double balance;
    
    public Account(String name,int accountNumber, double initialDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        deposit(initialDeposit);
    }
    
    public Account(String name,int accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double quantity){
        balance += quantity;
    }
    
    public void withdraw(double quantity){
        balance -= (quantity + 5);
    }
    
    public String toString(){
        return "Account " 
                + accountNumber 
                + ", Holder: " 
                + name 
                + ", Balance: $ " 
                + String.format("%.2f", balance);
    }
}
