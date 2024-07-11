package model.entities.order;

import model.entities.enums.BookGender;

public class Book {

    private String author;
    private String name;
    private double price;

    private BookGender bookGender;

    public Book(){

    }

    public Book(String author, String name, double price, BookGender bookGender) {
        this.author = author;
        this.name = name;
        this.price = price;
        this.bookGender = bookGender;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookGender getBookGender() {
        return bookGender;
    }

    public void setBookGender(BookGender bookGender) {
        this.bookGender = bookGender;
    }

    @Override
    public String toString() {
        return "Book name: " + name +
                ", price: " + price +
                ", author: " + author +
                ", gender: " + bookGender;
    }
}
