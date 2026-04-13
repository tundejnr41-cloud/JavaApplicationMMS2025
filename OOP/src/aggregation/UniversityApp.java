
package aggregation;


public class UniversityApp {
    public static void main(String[] args){
        Lecturer lect = new Lecturer("Henry Williams","88400499909");
        University uni = new University("UST",lect);
        
        uni.showDetails();
    }
}
