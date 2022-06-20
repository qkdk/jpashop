package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Book extends Item{

    private String author;
    private String isbn;


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }
}
