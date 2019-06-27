package GroupID.ArtifactID.dto;

import java.time.LocalDate;

public class Student {
    private String name;
    private char sex;
    private int age;
    private LocalDate DoB;
    int StudentId;
    private Major StudentMajor;


    public Student() {super(); }

    public Student(String name, char sex, int age, int StudentId, LocalDate DoB, Major StudentMajor){
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.StudentId =StudentId;
        this.DoB = DoB;
        this.StudentMajor = StudentMajor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDoB() {
        return DoB;
    }

    public void setDoB(LocalDate doB) {
        DoB = doB;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public Major getStudentMajor() {
        return StudentMajor;
    }

    public void setStudentMajor(Major studentMajor) {
        StudentMajor = studentMajor;

    }

    @Override
    public String toString() {
        return "Student=" + name +
                " StudentMajor=" + StudentMajor.getName() +
                '}';
    }
}


