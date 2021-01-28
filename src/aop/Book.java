package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Robin Hood")
    private String name;

    @Value("Rodin Harrison")
    private String author;

    @Value("1655")
    private int yearOfPublication;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getName()
    {
        return name;
    }
}
