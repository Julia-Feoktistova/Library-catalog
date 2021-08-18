package com.service;

import com.domain.Book;
import com.repository.Library;
import java.io.IOException;
import java.util.HashMap;
/*
Вывод отчета
 */
public class Report {

    public static void main(String[] args) throws IOException {
        Book book1 = new Book("Book1", "writer1", 100, Book.Genre.ANOTHER);
        Book book2 = new Book("Book2", "writer2", 200, Book.Genre.SCIENCE);
        Book book3 = new Book("Book3", "writer3", 250, Book.Genre.ROMANTIC);
        Library.allBooks = new HashMap<>() {
            @Override
            public int size() {
                return Library.allBooks.size();
            }

            @Override
            public Book put(Integer key, Book book) {
                return Library.allBooks.put(1, new Book("Book1", "writer1", 100, Book.Genre.ANOTHER));
            }

            @Override
            public Book remove(Object key) {
                return Library.allBooks.remove(1);
            }
        };

        System.out.println("Все книги: ");
        Logic.addBook(1, book1); //два варианта добавления в Map
        Library.allBooks.put(1, book1);

        Logic.addBook(2, book2);
        Logic.addBook(3, book3);
        Logic.getAllBook().forEach(System.out::println);
        System.out.println(Library.allBooks.size());

    }
}
