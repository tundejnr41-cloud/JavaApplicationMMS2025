import java.util.Scanner;

public class SingleSelection{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		
		if(age >=18){
			System.out.printf("age is %d, Oh wow, you are now an adult",age);
		}
	
	}
}