package com.domain;

import java.io.Serial;
import java.io.Serializable;

/**
 * Доменный класс Книга
 */
public class Book implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String bookName;
    private String writer;
    private int numbersOfPages;

    public Book() {

    }

    public Book(String bookName, String writer, int numbersOfPages) {
        this.bookName = bookName;
        this.writer = writer;
        this.numbersOfPages = numbersOfPages;
    }

    public enum Genre {

        FANTASY ("Фэнтези"),
        FANTASTIC ("Фантастика"),
        ROMANTIC ("Романтика"),
        COMEDY ("Комедия"),
        DETECTIVE ("Детектив"),
        SCIENCE ("Научная литература");

        private static String genre;

        public Genre setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        Genre(String genre) {

        }

        public static String getGenre() {
            return genre;
        }
    }

    public Book setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public Book setWriter(String writer) {
        this.writer = writer;
        return this;
    }

    public Book setNumbersOfPages(int numbersOfPages) {
        this.numbersOfPages = numbersOfPages;
        return this;
    }

    public String getBookName() {
        return bookName;
    }

    public String getWriter() {
        return writer;
    }

    public int getNumbersOfPages() {
        return numbersOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName ='" + bookName + '\'' +
                ", writer ='" + writer + '\'' +
                ", genre ='" + Genre.getGenre() + '\'' +
                ", numbersOfPages =" + numbersOfPages +
                '}';
    }
}

