import java.util.Scanner;

public class Exercise1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		///Exercise 1///
		System.out.print("Enter Initial velocity: ");
		float u = scan.nextInt();
		
		System.out.print("Acceleration: ");
		float a = scan.nextInt();
		
		System.out.print("Time taken: ");
		float t = scan.nextInt();
		
		double Distance = u*t + (a*Math.pow(t,2))/2;
		
		System.out.printf("Initial velocity = %f%n,Acceleration = %f%n,time taken is %f%n",u,a,t);
		System.out.printf("Total distance travelled is %f%n",Distance);
		
		
	}
}