package com.repository;

import com.domain.Book;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Создание и изменение коллекции каталог
 */
public class Library implements Serializable {

    @Serial
    private static final long serialVersionUID = 2L;

    private static ArrayList<Book> libraryList = new ArrayList<>();

    public static Map<Integer, Book> allBooks; // Для репорта

    public static void removeLibrary(ArrayList<Book> libraryList) {
    }

    public void addBook(com.domain.Book book) {
        libraryList.add(new Book(1, new Book("Book1", "writer1", 100, Book.Genre.ANOTHER)));
    }

    public void remove(com.domain.Book book) {
        libraryList.remove(book);
    }
}

