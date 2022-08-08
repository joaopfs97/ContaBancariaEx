package application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Account ac;
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();  
        System.out.print("Is there an initial deposit (y/n)?: ");
        String isDeposit = sc.nextLine();
       
        
        if(isDeposit.equals("y")){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            ac = new Account(name, accountNumber, initialDeposit);
        }
        else{
            ac = new Account(name, accountNumber);
        }
        
        System.out.println("Account data: ");
        System.out.println(ac);
        
        System.out.print("Enter a deposit value: ");
        double balance = sc.nextDouble();
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
