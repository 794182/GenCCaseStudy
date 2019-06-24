package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import dto.AddStudentDto;
import dto.Major;
import service.StudentService;
import service.StudentServiceImplementation;
import view.Runner;
import dto.Student;
public class StudentController {
    private Runner frontEnd;
    private StudentService service;
    
    public StudentController(Runner frontEnd, StudentService service){
        super();
        this.frontEnd = frontEnd;
        this.service = service;
        frontEnd.run(this);
    }

    public List<Major> getAllMajors() { return service.getAllMajors(); }

    public List<Student> getAllStudents() { return service.getAllStudents(); }

    public Student getStudentById(int i) { return service.getStudentById(i); }

    public Major getMajorById(int i) { return service.getMajorById(i); }

    public List<Major> getAllHardMajors() {return service.getAllHardMajors(); }

    public List<Student> getAllStudentsByMajorCost(double i) { return service.getAllStudentsByMajorCost(i); }

    public List<Major> getAllMajorsBetweenDifficulty(int low, int high) { return service.getAllMajorsBetweenDifficulty(low, high); }
    
    //public Student addStudent(AddStudentDto stuData){ return service.addStudent(stuData);}
    
    //public List<Student> listStudents() {return service.findAllStudents();}
    
    //public List<Student> listStudents(String major){return service.findStudentsByMajorName(major);}
    
    //public void graduateStudent(Student student) {service.graduateStudent(student);}
    
    /*public List<String> getMajors(){
        List<Major> majors = service.getMajors();
        List<String> majorName = new ArrayList<>();
        for (Major m: majors){
            majorName.add(m.getName());
        }
        Collections.sort(majorName);
        return majorName;
    }*/


}
