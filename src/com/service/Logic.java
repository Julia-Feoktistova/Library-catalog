package com.service;

import com.repository.BookRepository;
import com.repository.Library;
import com.domain.Book;

import java.io.IOException;
import java.util.ArrayList;


public class Logic {

    private static final BookRepository BOOK_REPOSITORY = new BookRepository();
    private static Library library = BOOK_REPOSITORY.getLibrary(new Library());

    public static void addBook(int i, Book book) throws IOException { //добавить книгу в репо
        library.addBook(book);
        BOOK_REPOSITORY.addBookToFile(book);
    }

    public static void removeBook(Book book) throws IOException{
        library.remove(book);
        BOOK_REPOSITORY.getBookFromFile(book);
    }

    public static ArrayList<Book> getAllBook() { //печать Мар в Репорте
        return new ArrayList<>(Library.allBooks.values());
    }
}
