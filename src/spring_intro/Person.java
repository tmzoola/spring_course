package spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//
//@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("dog")
    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
    private int age;

//
//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public void callYourPet(){
        System.out.println("Hello, pet");
        pet.say();
    }

//    @Autowired
//    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }


    public void setAge(int age) {
        System.out.println("Class Person : set Age");

        this.age = age;
    }
    public void setSurname(String surname) {
        System.out.println("Class Person : set Surname");
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }



}
