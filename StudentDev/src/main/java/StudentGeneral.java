
import controller.StudentController;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentGeneral {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController controller = ctx.getBean("Controller", StudentController.class);
    }
}
