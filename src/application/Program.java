package application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        
        System.out.print("Enter account holder: ");
        String name = sc.next();
    
        System.out.print("Is there an initial deposit (y/n)?: ");
        String isDeposit = sc.next();
       
        double balance = 0;
        if(isDeposit.equals("y")){
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
        } 
        
        Account ac = new Account(name, accountNumber, balance);      
        
        System.out.println("Account data: ");
        System.out.println(ac);
        
        System.out.print("Enter a deposit value: ");
        balance = sc.nextDouble();
        ac.deposit(balance);
        
        System.out.println("Updated account data: ");
        System.out.println(ac);
        
        System.out.println("Enter a withdraw value: ");
        balance = sc.nextDouble();
        ac.withdraw(balance);
        
        System.out.println("Updated account data: ");
        System.out.println(ac);
        
        sc.close();
    }
    
    
}
