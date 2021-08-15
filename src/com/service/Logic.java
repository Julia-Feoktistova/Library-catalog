package com.service;



import com.domain.Book;
import com.repository.BookRepository;
import com.repository.Library;

import java.io.IOException;

public class Logic {

    private final BookRepository BOOK_REPOSITORY = new BookRepository();
    private Library library = BOOK_REPOSITORY.getLibrary();

    public Logic() {

    }
    public void addBook(Book book) throws IOException {
        library.addBook(book);
        BOOK_REPOSITORY.addBookToFile(book);
    }

    public void removeBook(Book book) throws IOException{
        //library.remove(book);todo
        BOOK_REPOSITORY.getBookFromFile(book);
    }
}
