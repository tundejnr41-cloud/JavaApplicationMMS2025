
package composition;

import java.util.List;
import java.util.ArrayList;

public class BankAccount {
    String accountNumber;
    List<Transaction> transactions;
    
    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.transactions = new ArrayList<>();
    }
    
    void deposit(double amount){
        transactions.add(new Transaction("Deposit",amount));
       
    }
    
    void withdraw(double amount){
        transactions.add(new Transaction("Withdrawal",amount));
        
    }
    
    void showTransactions(){
        System.out.println("Transactions for ACcount: " + accountNumber);
        for(Transaction t : transactions){
            t.display();
        }
    }
}
