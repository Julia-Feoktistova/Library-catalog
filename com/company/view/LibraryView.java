package com.company.view;

import com.company.domain.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryView {
    Book book = new Book();

    public void printLibraryList(ArrayList libraryList) {
        int i = 0;
        for (Book:
             libraryList) {
            System.out.println(i++ + "Название  " + i + "-й книги: " + book);
            libraryList.set(book);
        }
    }

    public void addBook(ArrayList libraryList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        book.setBookName(scanner.next());
        System.out.println("Введите автора книги: ");
        book.setWriter(scanner.nextLine());
        System.out.println("Выберите жанр: 1 - детектив" + System.lineSeparator() +
                "2 - комедия" + System.lineSeparator() + "2 - фантастика" + System.lineSeparator() +
                "4 - фэнтези" + System.lineSeparator() + "5 - Романтика" + System.lineSeparator() +
                "6 - научная литература");
        Book.Genre.setGenre() = scanner.next();
        System.out.println("Кол-во станиц: ");
        book.setNumbersOfPages(scanner.nextInt());
        libraryList.add(book);
    }

    public void removeBook(ArrayList libraryList, Book book) {
        libraryList.remove(book);
    }

    public void printBookInfo(book) {
        System.out.println(book);
    }
}