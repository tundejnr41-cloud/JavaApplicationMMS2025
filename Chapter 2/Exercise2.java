import java.util.Scanner;

public class Exercise2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		///Exercise 2///
		System.out.print("Enter radius: ");
		double radius = scan.nextInt();
		
		System.out.print("Enter Height: ");
		float height = scan.nextInt();
		
		float pi = 22/7;
		
		double  volume = pi * Math.pow(radius,2) * height;
		
		System.out.printf("Radius = %f%n Height = %f%n",radius,height);
		System.out.printf("Volume of cylinder = %f%n",volume);
		
		
	}
}