
package composition;


public class Transaction {
    String type;
    double amount;
    
    public Transaction(String type, double amount){
        this.type = type;
        this.amount = amount;
    }
    
    public void display(){
        System.out.printf("%-15s :%s%n","Transaction Type",type);
        System.out.printf("%-15s :%.2f%n","Transaction Amount",amount);
    }
}
