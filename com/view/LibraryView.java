package com.view;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Класс для создания каталога через консольные комментарии пользователя
 **/
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

    ArrayList libraryList = new ArrayList();
    Scanner sc = new Scanner(System.in);

    public void setCatalog(ArrayList libraryList) { //создать библиотеку

        System.out.println("Введите количество книг в текущем сборнике:");
        int k = sc.nextInt();
        sc.close();
        for (int i = 0; i < libraryList.size(); i++) {
            System.out.println("Название  " + (i + 1) + "-й книги: ");
            String bookNames = sc.next();
            System.out.println("Введите автора: ");
            String writer = sc.next();
            System.out.println("Введите жанр книги: ");
            String genre = sc.next();
            System.out.println("Количество страниц: ");
            int numbersOfPages = sc.nextInt();
            ArrayList libraryList1 = libraryList.set(i, (bookNames, writer, genre, numbersOfPages));
        }
    }

    public void printGenre() { //фильтровать по жанру
        System.out.println("Выберите жанр: 1 - детектив" + System.lineSeparator() +
                "2 - комедия" + System.lineSeparator() + "2 - фантастика" + System.lineSeparator() +
                "4 - фэнтези" + System.lineSeparator() + "5 - Романтика" + System.lineSeparator() +
                "6 - научная литература");
        int genreSelect = sc.nextInt();
        switch (genreSelect) {
            case 1:
                System.out.println("Книги по жанру " + Book.Genre.DETECTIVE.getGenre() +); //как выполнить фильтрацию?
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:
        }
    }
}