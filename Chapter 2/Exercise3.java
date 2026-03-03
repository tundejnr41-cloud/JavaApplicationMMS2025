import java.util.Scanner;

public class Exercise3{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		///Exercise 3///
		System.out.print("Enter temperature in Celsius: ");
		float Celsius = scan.nextInt();
		
		
		double Fahrenheit = (Celsius * 9/5) + 32;
		
		System.out.printf("Temperature in Celsius is %f%n Therefore Temp in Fahrenheit = %f%n",Celsius,Fahrenheit);
		
	}
}