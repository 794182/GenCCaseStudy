package dto;

import java.time.LocalDate;

public class Student {
    private String name;
    private Major studentMajor;
    private int age;
    private char sex;
    private LocalDate dob;
    private int studentId;

    public Student() {
        super();
    }

    public Student(String inputName, Major inputStudentMajor, int inputAge, char inputSex, LocalDate inputDob, int inputStudentId) {
        super();
        name = inputName;
        studentMajor = inputStudentMajor;
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

    public Major getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(Major studentMajor) {
        this.studentMajor = studentMajor;
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

    @Override
    public String toString() {
        return
                "\n\n name:\t" + name +
                ",\n studentMajor:\t" + studentMajor +
                ",\n age:\t" + age +
                ",\n sex:\t" + sex +
                ",\n dob:\t" + dob +
                ",\n studentId:\t" + studentId+"\n\n"
                ;
    }
}
