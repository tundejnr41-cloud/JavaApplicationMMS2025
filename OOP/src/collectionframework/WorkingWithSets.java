package collectionframework;

import java.util.Set;
import java.util.HashSet;

public class WorkingWithSets {
    public static void main(String[] args){
        Set<Integer> numbers = new HashSet<>();
        
        numbers.add(16);
        numbers.add(18);
        numbers.add(25);
        numbers.add(21);
        numbers.add(8);
        numbers.add(12); 
        numbers.add(8);
        
        for(int number: numbers){
          System.out.printf("%-10d %n",number);
        }
        System.out.println("The size of the collection is " + numbers.size());
    }
    
}