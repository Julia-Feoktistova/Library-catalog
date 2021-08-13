package com.service;

import java.awt.print.Book;
import repository.BookRepository;
import java.io.IOException;

public class Logic {

    private final BookRepository BOOK_REPOSITORY = new BookRepository();
    private Library library = new Library();

    public Logic() {

    }
    public void addBook(Book book) throws IOException {
        library = BOOK_REPOSITORY.getLibrary();
        library.addBook(book);
        BOOK_REPOSITORY.addBookToFile(book);
    }

    public void removeBook(Book book) throws IOException{
        library = BOOK_REPOSITORY.getLibrary();
        library.remove(book);
        BOOK_REPOSITORY.getBookFromFile(book);
    }
}
