
package aggregation;


public class University {
    String name;
    Lecturer lecturer;
    
    public University(String name,Lecturer lecturer){
        this.name = name;
        this.lecturer = lecturer;
        
    }
    
    void showDetails(){
        System.out.println(name + " has lecturer " + lecturer.name + " and lecturer contact is " + lecturer.phone);
    }
}
