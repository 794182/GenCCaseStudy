package dto;

import java.time.LocalDate;

public class AddStudentDto {
    private String name;
    private String studentMajorName;
    private int age;
    private char sex;
    private LocalDate dob;
    private int studentId;

    public AddStudentDto() {
        super();
    }

    public AddStudentDto(String inputName, String inputStudentMajorName, int inputAge, char inputSex, LocalDate inputDob, int inputStudentId) {
        super();
        name = inputName;
        studentMajorName = inputStudentMajorName;
        age = inputAge;
        sex = inputSex;
        dob = inputDob;
        studentId = inputStudentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentMajorName() {
        return studentMajorName;
    }

    public void setStudentMajorName(String studentMajorName) {
        this.studentMajorName = studentMajorName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
