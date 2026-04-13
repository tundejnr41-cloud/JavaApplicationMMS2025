package mainapp;

import encapsulation.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class GreenLandApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        int studentId = scan.nextInt();
        
        scan.nextLine();
        
         System.out.print("Enter Student First Name: ");
        String firstName = scan.nextLine();
        
        System.out.print("Enter Student Last Name: ");
        String lastName = scan.nextLine();
        
        System.out.print("Enter Student Gender: ");
        char gender = scan.next().charAt(0);
        scan.nextLine();
        
        System.out.print("Enter Student Date of  Birth: ");
        String dateOfBirth = scan.nextLine();
        
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        
        
        System.out.print("Enter Student Phone Number: ");
        String phoneNumber = scan.nextLine();
       
        
        System.out.print("Enter Student Course: ");
        String course = scan.nextLine();
        
        System.out.print("Enter Student Grade: ");
        char grade = scan.next().charAt(0);
        scan.nextLine();
        
        Student student1 = new Student(studentId, firstName,lastName,
       gender, birthDate, phoneNumber, course, grade);
        
        student1.display();
    }
    
}