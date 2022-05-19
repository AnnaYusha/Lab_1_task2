package ru.belova.java;

import java.util.Arrays;
import java.util.Objects;

public class Book {    //класс для хранения данных о книге
    private String name;
    private int year;
    private String[] authors;
    private String author;
    private Publishing publishing;

    public Book(String name, int year, Publishing publishing) {
        //название, год издания, издательство (для случая, если авторов нет);
        this.name = name;
        this.year = year;
        this.publishing = publishing;
    }

    public Book(String name, String author, int year, Publishing publishing) {
        //название, автор, год издания, издательство;
        this.name = name;
        this.author = author;
        this.year = year;
        this.publishing = publishing;
    }

    public Book(String name, String[] authors, int year, Publishing publishing) {
        //название, список (массив) авторов, год издания, издательство;
        this.name = name;
        this.authors = authors;
        this.year = year;
        this.publishing = publishing;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("неправильно заполнен name");
        }
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException(" неправильно заполнен year");

        }
        this.year = year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        if (authors == null || Arrays.stream(authors).anyMatch(Objects::isNull)) {
            throw new IllegalArgumentException(" пустой массив или пустая ссылка внутри массива");
        }
        this.authors = authors;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Publishing getPublishing() {
        return publishing;
    }

    public void setPublishing(Publishing publishing) {
        this.publishing = publishing;
    }





    @Override
    public String toString() {
        return
                "название ='" + name + '\'' +
                        ", год =" + year +
                        (authors != null ? (", авторы =" + Arrays.toString(authors)) : "") +
                        (author != null ? (", автор =" + author) : "") + ",  " + publishing;
    }

    public void print() {
        System.out.println(this);

    }


    public static void printAll(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            books[i].print();
        }
    }

    public static void correctPrint(Book[] books) {

        for (Book book : books) {
            if ("БХВ".equals(book.getPublishing().getPublishing())) {
                book.getPublishing().setCity("Санкт-Петербург");
            }
            book.print();
        }


    }
}





