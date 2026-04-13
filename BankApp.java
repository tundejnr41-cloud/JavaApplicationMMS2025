public class BankApp{
	public static void main(String[] args){
		BankAccount bankAccount1 = new BankAccount("John Williams","3029485738","SAVINGS",534790.85);
		bankAccount1.displayAcctInfo();
		
		System.out.println("============================================================================");
		
		BankAccount bankAccount2 = new BankAccount("Akintunde David","8067626867","CURRENT",23456568.98);
		bankAccount2.displayAcctInfo();
		
		bankAccount2.deposit(3774400.00);
		bankAccount2.displayAcctInfo();
	}
}