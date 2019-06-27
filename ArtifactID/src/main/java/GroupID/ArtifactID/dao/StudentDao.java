package GroupID.ArtifactID.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import GroupID.ArtifactID.dto.Major;
import GroupID.ArtifactID.dto.Student;

public interface StudentDao {

    public Student getStudentById(int id);

    public Major getMajorById(int id);

    public List<Student> getAllStudents();

    public List<Major> getAllMajors();

    public List<Major> getAllHardMajors();

    public List<Student> getAllStudentsByMajorCost(double i);

    public List<Major> getAllMajorsBetweenDifficulty(int low, int high);

    public List<Student> getStudentsByMajor(Major StudentMajor);

    public Major getMajorByName (String name);

    public void addNewStudent (Student s);

    public boolean graduateStudent (Student s);

    public List<Student> searchStudents (Map<String, String> params);
}
