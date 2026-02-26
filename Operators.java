public class Operators{
  public static void main(String[] args){
	  //assignment operator(=)
	  int num = 50;
	  System.out.printf("The value num is %d",num);
	  
	  //arithmetic operators
	  int num1 = 100;
	  int num2 = 500;
	  
	  int addition = num1 + num2;
	  System.out.printf("The sum of %d and %d is %d%n",num1,num2,addition);
	  
	  int subtraction = num1 - num2 ;
	  System.out.printf("The difference between %d and %d is %d%n",num1,num2,subtraction);
	  
	  int multiplication = num1 * num2 ;
	  System.out.printf("The product of %d and %d is %d%n",num1,num2,multiplication);
	  
	  double quotient = (double)num1/num2;
	  System.out.printf("The quotient of %d and %d is %f%n",num1,num2,quotient);
  }
}