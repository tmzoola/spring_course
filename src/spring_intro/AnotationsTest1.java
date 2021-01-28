package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotationsTest1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());

        //        Pet pet = context.getBean("cat",Pet.class);
//        pet.say();


        context.close();
    }
}
