package com.company.service;

import company.domain.Book;
import company.domain.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService extends Book {

    Scanner scanner = new Scanner(System.in);

    public BookService(String bookName, String writer, String Genre, int numbersOfPages) {
        super(bookName, writer, Genre, numbersOfPages);
    }

    public static void createNewLibrary(String nameLibrary) {
        Library library = new Library();
        System.out.println("Введите название каталога");
        Library.setNameLibrary(scanner.next());
    }

    public static void removeLibrary(String nameLibrary, ArrayList libraryList) {
        System.out.println("Введите название каталога, который хотите удалить");
        libraryList = null;
        System.gc();
    }

    public void printLibraryList(ArrayList libraryList) {
        int i = 0;
        for (Book book : libraryList)
            System.out.println(i++ + "Название  " + i + "-й книги: " + book);
        libraryList.set(bookName);
    }

    public void addBook(ArrayList libraryList) {
        System.out.println("Введите название книги: ");
        Book.getName(scanner.nextLine());
        System.out.println("Введите автора книги: ");
        Book.getWriter(scanner.nextLine());
        System.out.println("Выберите жанр: 1 - детектив" + System.lineSeparator() +
                "2 - комедия" + System.lineSeparator() + "2 - фантастика" + System.lineSeparator() +
                        "4 - фэнтези" + System.lineSeparator() + "5 - Романтика" + System.lineSeparator() +
                        "6 - научная литература");
        Genre = scanner.next();
        System.out.println("Кол-во станиц: ");
        Book.getNumbersOfPages(scanner.nextInt());
        Book book = new Book(bookName, writer, Genre, numbersOfPages);
        libraryList.add(book);
    }

    public void removeBook(ArrayList libraryList, Object book) {
        libraryList.remove(book);
    }

}
