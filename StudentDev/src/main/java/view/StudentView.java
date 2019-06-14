package view;

import controller.StudentController;
import dto.AddStudentDto;
import dto.Student;
import service.InvalidMajorNameException;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class StudentView implements StudentRunner {

    StudentController controller;

    public StudentView() {

    }

    public void run(StudentController c) {
        controller = c;

        System.out.println("All Students: " + c.listStudents());
        System.out.println("All Computer Engineering: " + c.listStudents("Computer Engineering"));
        System.out.println("All Computer Science: " + c.listStudents("Computer Science"));
        System.out.println("Majors Available: " + c.getMajors());

        try {
            c.addStudent(new AddStudentDto("John Davis", "Computer Engineering", 21, 'M', LocalDate.of(1998, 1, 1), 4523));
            System.out.println("John Davis added");
        } catch(InvalidMajorNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            c.addStudent(new AddStudentDto("Vaughn Herdell", "Computer Science", 21, 'M', LocalDate.of(1997, 2, 21), 1099));
            System.out.println("Vaughn Herdell added");
        } catch(InvalidMajorNameException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All Students: " + c.listStudents());
        System.out.println("All Computer Engineering: " + c.listStudents("Computer Engineering"));
        System.out.println("All Computer Science: " + c.listStudents("Computer Science"));

        List<Student> available = c.listStudents();
        c.graduateStudent(available.get(1));
        System.out.println("Student Graduated");

        System.out.println("All Students: " + c.listStudents());
        System.out.println("All Computer Engineering: " + c.listStudents("Computer Engineering"));
        System.out.println("All Computer Science: " + c.listStudents("Computer Science"));

        //END OF TEST CASES
        System.out.println("\n\nTEST CASES COMPLETE");
        System.out.println("Technocrats University");
        boolean repeat = true;
        Scanner myScanner = new Scanner(System.in);
        String newStudentName, newStudentMajor;
        int newStudentAge;
        char newStudentSex;
        String newStudentDobString;
        LocalDate newStudentDob;
        int newStudentId;
        int selection = 0;
        while(repeat) {
            System.out.print("1. View all students\n2. View all majors\n3. Add new student\n4. Exit\nSelect option: ");
            selection = myScanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("All Students: " + c.listStudents());
                    break;
                case 2:
                    System.out.println("All Available: " + c.getMajors());
                    break;
                case 3:
                    myScanner.nextLine();
                    System.out.print("Enter new student name: ");
                    newStudentName = myScanner.nextLine();
                    System.out.print("Enter new student major: ");
                    newStudentMajor = myScanner.nextLine();
                    System.out.print("Enter new student age: ");
                    newStudentAge = myScanner.nextInt();
                    System.out.print("Enter new student sex: ");
                    myScanner.nextLine();
                    newStudentSex = myScanner.nextLine().charAt(0);
                    System.out.print("Enter new student date of birth (YYYY-MM-DD): ");
                    newStudentDobString = myScanner.nextLine();
                    newStudentDob = LocalDate.parse(newStudentDobString);
                    System.out.print("Enter new student ID: ");
                    newStudentId = myScanner.nextInt();

                    //Entering student into system
                    c.addStudent(new AddStudentDto(newStudentName, newStudentMajor, newStudentAge, newStudentSex, newStudentDob, newStudentId));
                    System.out.println(newStudentName + " added");
                    break;
                case 4:
                    repeat = false;
                    break;
                default:
                    System.out.println("Please try again");
                    break;
            }
        }
    }
}
