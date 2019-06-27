package GroupID.ArtifactID.service;

import GroupID.ArtifactID.dto.Major;
import GroupID.ArtifactID.dto.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface StudentService {
    public Student getStudentById(int id);

    public Major getMajorById(int id);

    public List<Major> getAllMajors();

    public List<Student> getAllStudents();

    public List<Major> getAllHardMajors();

    public List<Student> getAllStudentsByMajorCost(double i);

    public List<Major> getAllMajorsBetweenDifficulty(int low, int high);
}
