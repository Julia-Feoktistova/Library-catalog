package com.company.repository;

import java.awt.print.Book;

public class BookRepository {
    //работа с хранилищем

    private BookRepository bookRepository = new BookRepository();

    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public void removeBook(Book book) {
        bookRepository.removeBook(book);
    }

}
