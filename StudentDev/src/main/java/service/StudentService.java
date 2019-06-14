package service;

import dao.StudentDao;
import dto.AddStudentDto;
import dto.Major;
import dto.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentService {
    StudentDao dao;

    public StudentService(StudentDao inputDao) {
        dao = inputDao;
    }

    public Student addStudent(AddStudentDto studentData) {
        Major major = dao.getMajorByName((studentData.getStudentMajorName()));

        if(major == null) {
            throw new InvalidMajorNameException(studentData.getStudentMajorName() + " is an invalid major name.");
        }

        Student student = new Student(studentData.getName(), major, studentData.getAge(), studentData.getSex(), studentData.getDob(), studentData.getStudentId());
        dao.addNewStudent(student);
        return student;
    }

    public List<Student> findStudentsByMajorName(String majorName) {
        Major major = dao.getMajorByName(majorName);
        if(major == null) {
            throw new InvalidMajorNameException(majorName + " is an invalid major name.");
        }
        return dao.getStudentsByMajor(major);
    }

    public List<Student> findAllStudents() {
        Map<Major, List<Student>> studentMap = dao.getAllStudents();
        List<Student> students = new ArrayList<>();
        for(List<Student> s : studentMap.values()) {
            students.addAll(s);
        }
        return students;
    }

    public boolean graduateStudent(Student student) {
        return dao.graduateStudent(student);
    }

    public List<Major> getMajors() {
        return new ArrayList<Major>(dao.getAllMajors());
    }
}
