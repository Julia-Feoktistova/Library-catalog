package com.company.view;

import com.company.domain.Book;
import com.company.domain.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryView {

    public static void main(String[] args) {

        public void printLibraryList(ArrayList libraryList) {
        int i = 0;
        for (Book book : libraryList)
            System.out.println(i++ + "Название  " + i + "-й книги: " + book);
        libraryList.set(getBookName);//todo почему нe видит геттер из класса Book
        }

        public void addBook(ArrayList libraryList) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название книги: ");
            Book.getBookName(scanner.nextLine());
            System.out.println("Введите автора книги: ");
            Book.getWriter(scanner.nextLine());
            System.out.println("Выберите жанр: 1 - детектив" + System.lineSeparator() +
                    "2 - комедия" + System.lineSeparator() + "2 - фантастика" + System.lineSeparator() +
                    "4 - фэнтези" + System.lineSeparator() + "5 - Романтика" + System.lineSeparator() +
                    "6 - научная литература");
            Genre = scanner.next();
            System.out.println("Кол-во станиц: ");
            Book.getNumbersOfPages(scanner.nextInt());
            Book book = new Book(getBookName, getWriter, getGenre, getNumbersOfPages);//todo как присвоить значения в конструктор?
            libraryList.add(book);
        }

        public void removeBook(ArrayList libraryList, Book book) {
            libraryList.remove(book);
        }
    }
}