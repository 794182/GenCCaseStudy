package dao;

import dto.Major;
import dto.Student;

import java.util.*;

public class StudentDaoInMemory implements StudentDao{
    private Map<Major, List<Student>> students;

    public StudentDaoInMemory(Map<Major, List<Student>> inputStudents) {
        super();
        students = inputStudents;
    }

    public Map<Major, List<Student>> getAllStudents() {
        return new HashMap<Major, List<Student>>(students);
    }

    public Set<Major> getAllMajors() {
        return students.keySet();
    }

    public List<Student> getStudentsByMajor(Major major) {
        return students.get(major);
    }

    public Major getMajorByName(String name) {
        Set<Major> majors = students.keySet();
        Major major = majors.stream().filter(s -> s.getName().equals(name)).findFirst().orElse(null);
        return major;
    }

    public void addNewStudent(Student s) {
        if(students.keySet().contains((s.getStudentMajor()))) {
            students.get(s.getStudentMajor()).add(s);
        } else {
            students.put(s.getStudentMajor(), new ArrayList<Student>());
            students.get(s.getStudentMajor()).add(s);
        }
    }

    public boolean graduateStudent(Student s) {
        return students.get(s.getStudentMajor()).remove(s);
    }

    public List<Student> searchStudents(Map<String, String> params) {
        return null;
    }
}
