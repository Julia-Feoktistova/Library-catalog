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
    private Genre genre;

    public Book(int i, Book book) {//для репорта через тип Мар

    }

    public Book(String bookName, String writer, int numbersOfPages, Genre genre) {
        this.bookName = bookName;
        this.writer = writer;
        this.numbersOfPages = numbersOfPages;
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public enum Genre {

        FANTASY("Фэнтези"),
        FANTASTIC("Фантастика"),
        ROMANTIC("Романтика"),
        COMEDY("Комедия"),
        DETECTIVE("Детектив"),
        SCIENCE("Научная литература"),
        ANOTHER("Другой жанр");

        private String value;


        Genre(String genre) {
            this.value = genre;
        }

        public static Genre getByValue(String value) {
            for (Genre genre : values()) {
                if (genre.value.equalsIgnoreCase(value)) {
                    return genre;
                }
            }
            return ANOTHER;
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
        return "Книга: " +
                "название = " + bookName + '\'' +
                ", автор = " + writer + '\'' +
                ", жанр = " + Genre.getByValue(genre.value) + '\'' +
                ", страниц = " + numbersOfPages;
    }
}

