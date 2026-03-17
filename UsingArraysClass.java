import java.util.Arrays;

public class UsingArraysClass{
	public static void main(String[] args){
		
		int[] numbers = {6,2,5,9,1,3,7,4,8,10};
		Arrays.sort(numbers);
		
		int index = Arrays.binarySearch(numbers,7);
		System.out.println("The element index is " + index);
		
		for(int num : numbers){
		System.out.printf("%d%n",num);
		}
	}
}