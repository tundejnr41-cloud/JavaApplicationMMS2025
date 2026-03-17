public class InstanceMethod{
	public static void main(String [] args){
		InstanceMethod im = new InstanceMethod();
		
		System.out.println(im.name("Mercy Ben") + "is saying ");
		im.greetings();
	}
	public String name(String fullName){
		return fullName;
	}
	public void greetings(){
		int i = 1;
		while(i <=10){
			System.out.printf("%d Good Morning Class %n",i);
			i++;
		}
	}
	
}