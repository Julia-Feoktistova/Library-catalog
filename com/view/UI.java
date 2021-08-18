package com.view;

import com.domain.Book;
import com.repository.BookRepository;
import com.repository.Library;
import com.service.Logic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Консольное меню
 */
public class UI {
    public static void main(String[] args) throws IOException {
        ArrayList<Book> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Вас приветствует автоматизированный книжный каталог. Выберите действие: " + System.lineSeparator() +
                        "1 - создать новый каталог;" + System.lineSeparator() +
                        "2 - удалить каталог" + System.lineSeparator() +
                        "3 - отобразить содержимое каталога;" + System.lineSeparator() +
                        "4 - добавить книгу" + System.lineSeparator() +
                        "5 - удалить книгу" + System.lineSeparator() +
                        "6 - отобразить книги в каталоге по жанру;" + System.lineSeparator() +
                        "7 - сортировать алфавиту;" + System.lineSeparator() +
                        "8 - сортировать по авторам по алфавиту;" + System.lineSeparator() +
                        "9 - сортировать возрастанию количества страниц;" + System.lineSeparator() +
                        "10 - сортировать по убыванию количества страниц");
                int userChoice = sc.nextInt();

                switch (userChoice) {
                    case 1 -> {
                        System.out.println("Название каталога книг: ");
                        Scanner nameScan = new Scanner(System.in);
                        String nameOfLibrary = nameScan.next();
                        LibraryView.setCatalog(arrayList);
                        System.out.println("каталог " + nameOfLibrary + " создан");
                        continue;
                    }
                    case 2 -> {
                        Library.removeLibrary(arrayList);
                        System.out.println("Каталог " + arrayList + " удален");
                        continue;
                    }
                    case 3 -> {
                        LibraryView.printBookInfo(new Book ("Book1", "writer1", 100, Book.Genre.ANOTHER));
                        continue;
                    }
                    case 4 -> {
                        LibraryView.addBook(new Book("name", "writer", 100, Book.Genre.SCIENCE)); //добавить в Лист
                        Logic.addBook(1, new Book("name", "writer", 100, Book.Genre.SCIENCE)); //добавить в репозиторий
                        BookRepository.addBookToFile(new Book("name", "writer", 100, Book.Genre.SCIENCE));//добавить в файл
                        continue;
                    }
                    case 5 -> {
                        LibraryView.removeBook(new ArrayList<Book>(), new Book("name", "writer", 100, Book.Genre.SCIENCE));
                        Logic.removeBook(new Book("name", "writer", 100, Book.Genre.SCIENCE));
                        System.out.println("книга удалена");
                        continue;
                    }
                    case 6 -> {
                    }
                    default -> {
                        System.out.println("неправильный номер");
                        continue;
                    }
                }
            }
        } catch (RuntimeException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}