package GroupID.ArtifactID.service;

import GroupID.ArtifactID.dao.StudentDao;
import GroupID.ArtifactID.dao.StudentDaoDatabase;
import GroupID.ArtifactID.dto.Major;
import GroupID.ArtifactID.dto.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

public class StudentServiceImplementation implements StudentService {

    StudentDao dao;

    @Inject
    public void setDao(StudentDao dao) {
    	this.dao = dao;
    }
    
    public StudentServiceImplementation() {
        System.out.println("Service Created");
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
