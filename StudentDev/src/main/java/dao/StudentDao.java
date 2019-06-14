package dao;

import dto.Major;
import dto.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface StudentDao {
    public Map<Major, List<Student>> getAllStudents();

    public Set<Major> getAllMajors();

    public List<Student> getStudentsByMajor(Major major);

    public Major getMajorByName(String name);

    public void addNewStudent(Student s);

    public boolean graduateStudent(Student s);

    public List<Student> searchStudents(Map<String, String> params);
}
