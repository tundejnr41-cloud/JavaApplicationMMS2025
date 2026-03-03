public class UserDefinedMethod{
	public static String userName(String name){
		
		return name;
	}
	public static int checkAge(int age){
		if(age >= 18){
			System.out.println(UserDefinedMethod.userName("John Williams ") + "You are an adult");
		}
		else{
			System.out.println(UserDefinedMethod.userName("John Williams ") + "You are still a minor");
		}
		return age;
	}
	public static void main(String[] args){
		System.out.println(UserDefinedMethod.checkAge(25));
	}
}