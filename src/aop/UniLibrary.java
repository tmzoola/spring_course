package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbsractLibrary{

    public void getBook(){
        System.out.println("We get book here: UniLibrary: getBook");
        System.out.println("------------------------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("We add book here: UniLibrary: addBook");
        System.out.println("------------------------------------------------------");
    }

    public void returnBook(){
        System.out.println("We are returning book: UniLibrary: returnBook");
        System.out.println("------------------------------------------------------");
    }


    public void getMagazine(){
        System.out.println("We get magazine here: UniLibrary: getMagazine");
        System.out.println("------------------------------------------------------");
    }

    public void addMagazine(){
        System.out.println("We add magazine here: UniLibrary: addMagazine");
        System.out.println("------------------------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("We return magazine here: UniLibrary: returnMagazine");
        System.out.println("------------------------------------------------------");
    }
}
