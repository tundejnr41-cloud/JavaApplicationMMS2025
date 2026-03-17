import java.util.*;

public class NumberGenerator{
	public static void main(String[] args){
		Random rand = new Random();
		//any integer//
		System.out.println(Math.abs(rand.nextInt()));
		
		//within a particular range//
		System.out.println(rand.nextInt(70)+1);
		
		//generate any double//
		System.out.println(rand.nextDouble());
		
		//generate any boolean//
		System.out.println(rand.nextBoolean()); 
	}
}