import java.util.Scanner;
import javax.swing.JOptionPane; 
public class bankingapp { 
	public static void main(String[] args) {

        BankAccount obj1= new BankAccount("Danielle", "BAC432");
        obj1.showMenu(); 
        
    }
}
// Instance Variables 
 class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId; 
// Constructor Declaration of Class
//Will Display the Welcome Message for User 
    
    BankAccount(String cname, String cid) {
        customerName= cname;
        customerId= cid;
    }
    
     // method 1
    void deposit(int amount) {
        if(amount >0) {
                
            balance = balance + amount;
            previousTransaction= amount;
        }
    }
     // method 2
    void withdraw(int amount) {
        if(amount != 0) {
            balance= balance + amount;
            previousTransaction= amount;
        }
    }
     // method 3
    void getPreviousTransaction() {
        if(previousTransaction > 0) {
            System.out.println("You made a deposit of: " +previousTransaction);
        }
        else if(previousTransaction > 0) {
            System.out.println("You made a Withdrawl: " +Math.floor(previousTransaction));
        }
        else {
            System.out.println("No transaction Made...");
        }
    }
     // method 4
     void showMenu() {
        char option='\0';
        Scanner sc= new Scanner(System.in);
    
    System.out.println("Welcome " + customerName);
    System.out.println("Your ID is " + customerId); 
    System.out.println("\n");
    System.out.println("A. Check Balance");
    System.out.println("B. Deposit"); 
    System.out.println("C. Withdraw ");
    System.out.println("D. Previous Transaction ");
    System.out.println("E. Apply for a loan ");
    System.out.println("F. Exit"); 
    
    //This loop will execute the code block once, before checking if the condition is true
    // Do this statement of cases while E is not true. 
    
    do {
        System.out.println("============================================================");
        System.out.println("Enter an Option"); 
        System.out.println("============================================================");
        option = sc.next ().charAt(0);
        System.out.println("\n"); 
switch(option) {
case 'A':
    System.out.println("=================================================================");
    System.out.println("Balance: " +balance); 
    System.out.println("================================================================");
    System.out.println("\n"); 
    break;
    
case 'B':
    System.out.println("=================================================================");
    System.out.println("Enter an Amount to Deposit"); 
    System.out.println("================================================================");
    int amount = sc.nextInt();
    deposit(amount);
    System.out.println("\n"); 
    break;
    
    
case 'C':
    System.out.println("=================================================================");
    System.out.println("Enter an amount to Withdraw");
    if(balance == 0 || balance < 0) {
        System.out.println("You don't have any available funds."); 
    } else {
        
    
    System.out.println("================================================================");
    int amount2 = sc.nextInt(); withdraw(amount2); }
    System.out.println("\n"); 
    break;
    
case 'D': 
    System.out.println("=================================================================");
    getPreviousTransaction();
    System.out.println("================================================================");
    System.out.println("\n");
    break;

    case 'E': 
    System.out.println("=================================================================");
    System.out.println("Enter an amount you'd like to lend");
    int amount2 = sc.nextInt(); 
    if( balance < amount2) {
        System.out.println("You don't have any available funds."); 
    } else {
        
    System.out.println("================================================================");
    
    System.out.println("The interest rate on your loan is " + ((amount2 * .18) + amount2)); 
    break;
    }   
case 'F':
    System.out.println("===================================================================");
    break; 
    
    default :
System.out.println("Invalid Option, Please Try Again");
break;
}
    }while(option != 'F');
    System.out.println("Thank you. Please Come Again");
    
    }
}