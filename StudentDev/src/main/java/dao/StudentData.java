package dao;

import dto.Major;
import dto.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentData {
    private static Major computerScience = new Major("Computer Science", 5, 25000.58);
    private static Major electricalEngineering = new Major("Electrical Engineering", 10, 25000.00);
    private static Major computerEngineering = new Major("Computer Engineering", 7, 26500.25);

    public static Map<Major, List<Student>> getProdData() {
        Map<Major, List<Student>> prodData = new HashMap<>();
        prodData.put(computerScience, new ArrayList<Student>());
        prodData.put(electricalEngineering, new ArrayList<Student>());
        prodData.put(computerEngineering, new ArrayList<Student>());
        prodData.get(computerScience).add(new Student("Scott Shriver", computerScience, 22, 'M', LocalDate.of(1997, 06, 11), 2380));
        prodData.get(computerEngineering).add(new Student("Alyssa Wright", computerEngineering, 22, 'F', LocalDate.of(1997, 06, 22), 4896));
        prodData.get(electricalEngineering).add(new Student("Jonathan Khabbaz", electricalEngineering, 23, 'M', LocalDate.of(1996, 11, 06), 3333));
        prodData.get(computerScience).add(new Student("Marlena Hochmuth", computerScience, 21, 'F', LocalDate.of(1997, 07, 13), 1793));
        return prodData;
    }
}
