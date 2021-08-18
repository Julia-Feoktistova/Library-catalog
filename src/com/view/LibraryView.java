package com.view;

import com.domain.Book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс для создания каталога через консольные комментарии пользователя
 **/
public class LibraryView {

    static ArrayList libraryList = new ArrayList();

// todo   public static void printLibraryList(Library libraryList, String nameOfLibrary) {
//        int i = 0;
//        for (Object book : libraryList) {
//            System.out.println(i++ + "Название  " + i + "-й книги: " + book);
//            libraryList.set(i, book);
//        }
//    }


    public static ArrayList<Book> setCatalog(ArrayList<Book> libraryList) { //создать библиотеку
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество книг в текущем сборнике:");
        int k = scanner.nextInt();
        System.out.println("кол-во книг = " + k);
        scanner.close();
        for (int i = 0; i < libraryList.size(); i++) {
            Book book = new Book(1, new Book("Book1", "writer1", 100, Book.Genre.ANOTHER));
            libraryList.add(i, book);
        }
        return libraryList;
    }

    public static void addBook(Book book) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        book.setBookName(scanner.next());
        System.out.println("Введите автора книги: ");
        book.setWriter(scanner.next());
        System.out.println("Выберите жанр: 1 - детектив" + System.lineSeparator() +
                "2 - комедия" + System.lineSeparator() + "3 - фантастика" + System.lineSeparator() +
                "4 - фэнтези" + System.lineSeparator() + "5 - Романтика" + System.lineSeparator() +
                "6 - научная литература");
        // book.setGenre(Book.Genre.getByValue(scanner.next()));
        int genreSelect = scanner.nextInt();
        switch (genreSelect) {
            case 1:
                book.setGenre(Book.Genre.DETECTIVE);
            case 2:
                book.setGenre(Book.Genre.COMEDY);
            case 3:
                book.setGenre(Book.Genre.FANTASTIC);
            case 4:
                book.setGenre(Book.Genre.FANTASY);
            case 5:
                book.setGenre(Book.Genre.ROMANTIC);
            case 6:
                book.setGenre(Book.Genre.SCIENCE);
            default:
                book.setGenre(Book.Genre.ANOTHER);
        }
        System.out.println("Кол-во станиц: ");
        book.setNumbersOfPages(scanner.nextInt());
        libraryList.add(book);
        System.out.println(book);
    }

    public static void removeBook(ArrayList<Book> libraryList, Book book) {
        libraryList.remove(book);
    }


    public static void printBookInfo(Book book) {
        System.out.println(book);
    }
}