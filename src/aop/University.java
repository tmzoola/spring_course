package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private final List<Student> students = new ArrayList<>();

    public  void addStudent(){
        Student st1= new Student("Murodjon", 4,7.5);
        Student st2= new Student("Javokhir", 3,8.5);
        Student st3= new Student("Azizbek", 1,6.0);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Start of getStudents method");
//        System.out.println(students.get(3));
        System.out.println("Information  from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
