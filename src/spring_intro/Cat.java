package spring_intro;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{
    public Cat() {
        System.out.println("Class cat has been created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
