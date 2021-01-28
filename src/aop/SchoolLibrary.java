package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbsractLibrary {

    public void getBook() {
        System.out.println("We get book here: schoolLibrary\n");
    }
}
