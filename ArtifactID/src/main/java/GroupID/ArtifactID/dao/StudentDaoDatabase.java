package GroupID.ArtifactID.dao;

import GroupID.ArtifactID.dto.Major;
import GroupID.ArtifactID.dto.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoDatabase implements StudentDao {

    JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> getAllStudents() {
        List<Student> s = jdbcTemplate.query(GET_ALL_STUDENTS, new StudentMapper());
        return s;
    }

    public StudentDaoDatabase() {

    }

    @Inject
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        System.out.println(jdbcTemplate.toString());
    }

    //PREPARED STATEMENTS
    private static String GET_STUDENT_BY_ID = "SELECT * " + "FROM student " + "WHERE StudentId = ? ";
    private static String GET_MAJOR_BY_ID = "SELECT * " + "FROM major " + "WHERE MajorId = ? ";
    private static String GET_ALL_HARD_MAJORS = "SELECT * " + "FROM major " + "WHERE difficulty > 5 ";
    private static String GET_ALL_STUDENTS = "SELECT * FROM student ";
    private static String GET_ALL_MAJORS = "SELECT * FROM major ";
    private static String GET_ALL_STUDENTS_BY_MAJOR_COST = "SELECT * " + "FROM student " + "JOIN major " + "ON major.majorId = student.majorId " + "WHERE major.cost > ? " + "ORDER BY student.StudentId ";
    private static String GET_ALL_MAJORS_BETWEEN_DIFFICULTY = "SELECT * FROM major WHERE difficulty BETWEEN ? AND ? ";

    public List<Student> getAllStudentsByMajorCost(double cost) {
        List<Student> s = jdbcTemplate.query(GET_ALL_STUDENTS_BY_MAJOR_COST, new StudentMapper(), cost);
        return s;
    }

    public List<Major> getAllMajorsBetweenDifficulty(int low, int high) {
        List<Major> m = jdbcTemplate.query(GET_ALL_MAJORS_BETWEEN_DIFFICULTY, new MajorMapper(), low, high);
        return m;
    }

    public Student getStudentById(int id) {
        Student s = jdbcTemplate.queryForObject(GET_STUDENT_BY_ID, new StudentMapper(), id);
        return s;
        }

    public Major getMajorById(int id) {
        Major m = jdbcTemplate.queryForObject(GET_MAJOR_BY_ID, new MajorMapper(), id);
        return m;
    }

    @Override
    public List<Major> getAllMajors() {
        List<Major> majorList = jdbcTemplate.query(GET_ALL_MAJORS, new MajorMapper());
        return majorList;
    }

    @Override
    public List<Major> getAllHardMajors() {
        List<Major> hardMajors = jdbcTemplate.query(GET_ALL_HARD_MAJORS, new MajorMapper());
        return hardMajors;
    }

    @Override
    public List<Student> getStudentsByMajor(Major StudentMajor) {
        return null;
    }

    @Override
    public Major getMajorByName(String name) {
        return null;
    }

    @Override
    public void addNewStudent(Student s) {

    }

    @Override
    public boolean graduateStudent(Student s) {
        return false;
    }

    @Override
    public List<Student> searchStudents(Map<String, String> params) {
        return null;
    }

    private class MajorMapper implements RowMapper<Major> {

        @Override
        public Major mapRow(ResultSet rs, int rowNum) throws SQLException {
            Major m = new Major();
            m.setMajorId(rs.getInt("majorId"));
            m.setName(rs.getString("name"));
            m.setCost(rs.getDouble("cost"));
            m.setDifficulty(rs.getInt("difficulty"));
            return m;
        }
    }

    private class StudentMapper implements RowMapper<Student> {

        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student s = new Student();
            s.setStudentId(rs.getInt("StudentId"));
            s.setName(rs.getString("name"));
            s.setSex(rs.getString("sex").charAt(0));
            s.setAge(rs.getInt("age"));
            s.setDoB(rs.getDate("DoB").toLocalDate());
            int majorId = rs.getInt("MajorId");

            Major m = getMajorById(majorId);
            s.setStudentMajor(m);
            return s;
        }
    }
}
