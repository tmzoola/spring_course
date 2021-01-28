package spring_intro;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component

public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog been created");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    protected void init(){
        System.out.println("Class Dog: init method");
    }
    protected void destroy(){
        System.out.println("Class Dog: destroy method");
    }
}
