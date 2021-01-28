package aop.aspect;

import aop.MyConfig;
import aop.Student;
import aop.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudent();
        university.getStudents();
        university.getStudents();

//        Student student = new Student("Javo", 1, 2.0);
//        List<Student> students = new ArrayList<>();
//        students.add(student);
//        System.out.println(students);

        context.close();

    }
}
