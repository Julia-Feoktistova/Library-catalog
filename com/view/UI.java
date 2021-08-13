package com.view;

import java.util.Scanner;

/**
 * Консольное меню
 */
public class UI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Вас приветствует автоматизированный книжный каталог. Выберите действие: " +
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
            case 1:
                System.out.println("Название каталога книг: ");
                String nameOfLibrary = sc.nextLine();
                LibraryView.setCatalog(nameOfLibrary);
                System.out.println("каталог " + nameOfLibrary + " создан");
                break;
            case 2:
                System.out.println("Название каталога книг: ");
                nameOfLibrary = sc.nextLine();
                BookService.removeLibrary(nameOfLibrary);
                System.out.println("Каталог " + nameOfLibrary + " удален");
                break;
            case 3:
                System.out.println("Название каталога книг: ");
                nameOfLibrary = sc.nextLine();
                LibraryView.printLibraryList(nameOfLibrary);
                System.out.println(library.setNameLibrary(nameOfLibrary);
                library.getLibraryList();
                break;
            case 4:
                LibraryView.addBook(book)
                break;
            case 5:
                LibraryView.removeBook(library, Book book));
            case 6:


            case 7:
            case 8:
            case 9:
            case 10:
            default:
                System.out.println("неправильный номер");

        }
    }
}