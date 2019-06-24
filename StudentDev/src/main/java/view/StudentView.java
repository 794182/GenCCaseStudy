package view;

import controller.StudentController;
import service.StudentService;
import service.StudentServiceImplementation;
import dao.StudentDao;
import dao.StudentDaoDatabase;


public class StudentView extends Runner {
    StudentController controller;

    @Override
    public void run(StudentController s) {
        controller = s;
        System.out.println("All majors: " + s.getAllMajors().toString());
        System.out.println("All students: " + s.getAllStudents().toString());
        System.out.println("Major ID 1: " + s.getMajorById(1).toString());
        System.out.println("Student ID 1: " + s.getStudentById(1).toString());
        System.out.println("All hard majors: " + s.getAllHardMajors().toString());
        System.out.println("All students paying at least $23,000: " + s.getAllStudentsByMajorCost(20000.00).toString());
        System.out.println("All majors between 1 and 10 in difficulty: " + s.getAllMajorsBetweenDifficulty(1, 10).toString());
    }
}