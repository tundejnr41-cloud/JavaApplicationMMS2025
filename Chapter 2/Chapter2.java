import java.util.Scanner;

public class Chapter2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		///Exercise 1///
		System.out.print("Enter Initial velocity: ");
		double u = scan.nextInt();
		
		System.out.print("Acceleration: ");
		double a = scan.nextInt();
		
		System.out.print("Time taken: ");
		double t = scan.nextInt();
		
		double Distance = u*t + (a*Math.pow(t,2))/2;
		
		System.out.printf("Initial velocity = %f%n,Acceleration = %f%n,time taken is %f%n",u,a,t);
		System.out.printf("Total distance travelled is %f%n",Distance);
	}
}