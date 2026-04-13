package collectionframework;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UsingCollectionWithUserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<String> names = new ArrayList<>();
    
        System.out.print("Enter number of element in the collection: ");
        int number = input.nextInt();
    
        input.nextLine();
    
        System.out.println("======== Adding the in the collection ========= ");
        for(int i = 0; i<number; i++){
        System.out.print("Enter user Name: ");
        String name = input.nextLine();
        names.add(name);
        }
    
        System.out.println("======== Printing the in the collection ========== ");
        for (String name : names){
            System.out.println(name);
        }
    }
    
}
