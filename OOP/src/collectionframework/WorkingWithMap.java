package collectionframework;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;



public class WorkingWithMap {
    public static void main(String[] args){
        Map<Integer, String> names = new HashMap<>();
        
        names.put(101, "Henry");
        names.put(102, "Obi");
        names.put(103, "Gerry");
        names.put(104, "John");
        names.put(105, "Henry");
        names.put(106, "Obi");
        
        System.out.println(names.get(104));
        System.out.println(names.get(106));
        
        Set<Integer> keys = names.keySet();
        
        for(int key : keys){
            System.out.println(names.get(key));
        }
        
    }
    
}