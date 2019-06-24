package service;

import dao.StudentDao;
import dao.StudentDaoDatabase;
import dto.Major;
import dto.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentServiceImplementation implements StudentService {

    StudentDao dao;

    public StudentServiceImplementation(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student getStudentById(int id) {
        return dao.getStudentById(id);
    }

    @Override
    public Major getMajorById(int id) {
        return dao.getMajorById(id);
    }

    @Override
    public List<Major> getAllMajors() {
        return dao.getAllMajors();
    }

    @Override
    public List<Major> getAllHardMajors() { return dao.getAllHardMajors(); }

    @Override
    public List<Student> getAllStudentsByMajorCost(double i) { return dao.getAllStudentsByMajorCost(i); }

    @Override
    public List<Major> getAllMajorsBetweenDifficulty(int low, int high) { return dao.getAllMajorsBetweenDifficulty(low, high); }

    @Override
    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }
}
