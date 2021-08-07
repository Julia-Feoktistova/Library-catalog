package com.company.domain;

public class Book {

    protected String bookName;
    protected String writer;
    protected int numbersOfPages;
    protected String Genre;

    public Book(String bookName, String writer, String Genre,  int numbersOfPages) {
        this.bookName = bookName;
        this.writer = writer;
        this.numbersOfPages = numbersOfPages;
        this.Genre = Genre;
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
}

