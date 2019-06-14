package view;

import controller.StudentController;
import dao.StudentDao;
import dao.StudentDaoInMemory;
import dao.StudentData;
import service.StudentService;


public class TechnocratsUniversity {
    public static void main(String[] args) {
        StudentDao dao = new StudentDaoInMemory(StudentData.getProdData());
        StudentRunner view = new StudentView();
        StudentService service = new StudentService(dao);
        StudentController c = new StudentController(view, service);
    }
}
