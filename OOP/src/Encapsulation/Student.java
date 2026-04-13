package encapsulation;

import inheritance.Person;
import java.time.LocalDate;

public class Student extends Person {
        private int studentId;
        private String course;
        private char grade;
	
     
    public Student(int studentId, String firstName, String lastName, char gender,
            LocalDate birthDate, String phoneNumber, String course, char grade) {
           

        //call parent constructor
        super(firstName, lastName, gender, birthDate, phoneNumber);
        this.studentId = studentId;
        this.course = course;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }
    
    public void setStudentId(){
        this.studentId = studentId;
    }
    
    public String getCourse(){
        return course;
    }
    
    public void setCourse(String course){
        this.course = course;
    }
    
    public char getGrade(){
        return grade;
    }
    
    public void setGrade(char grade){
        this.grade = grade;
    }
    


    
        
    public void display(){
        System.out.println("");
        System.out.println("       Student Details       ");
        System.out.println("===============================================");
    
        System.out.printf("%-15s : %d%n","Student Id", getStudentId());
        System.out.printf("%-15s : %-15s%n","First Name", getFirstName());
        System.out.printf("%-15s : %-15s%n","Last Name", getLastName());
        System.out.printf("%-15s : %-15c%n","Gender", getGender());
        System.out.printf("%-15s : %-15s%n","Date of Birth", getBirthDate());
        System.out.printf("%-15s : %-15s%n","Phone Number", getPhoneNumber());
        System.out.printf("%-15s : %-15s%n","Course", getCourse());
        System.out.printf("%-15s : %-15c%n","Gender", getGrade());
   
    }
}