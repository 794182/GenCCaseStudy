package controller;

import dto.AddStudentDto;
import dto.Major;
import dto.Student;
import org.junit.runner.notification.RunNotifier;
import service.StudentService;
import view.StudentRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentController extends RunNotifier {
    private StudentRunner frontEnd;
    private StudentService service;

    public StudentController(StudentRunner frontEnd, StudentService service) {
        super();
        this.frontEnd = frontEnd;
        this.service = service;
        frontEnd.run(this);
    }

    public Student addStudent(AddStudentDto studentData) {
        return service.addStudent(studentData);
    }

    public List<Student> listStudents() {
        return service.findAllStudents();
    }

    public List<Student> listStudents(String major) {
        return service.findStudentsByMajorName(major);
    }

    public void graduateStudent(Student student) {
        service.graduateStudent(student);
    }

    public List<String> getMajors() {
        List<Major> majors = service.getMajors();
        List<String> majorNames = new ArrayList<>();
        for(Major m : majors) {
            majorNames.add(m.getName());
        }
        Collections.sort(majorNames);
        return majorNames;
    }
}
