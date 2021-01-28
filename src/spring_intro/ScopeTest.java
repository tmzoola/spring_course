package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog myDog = context.getBean("dog", Dog.class);
        Dog dog = context.getBean("dog",Dog.class);

        System.out.println(dog==myDog);

        System.out.println(myDog);
        System.out.println(dog);
        context.close();
    }
}
