package com.company.service;

import company.domain.Library;

import java.util.Scanner;

public class PrintInfo implements company.service.BookService {

    public PrintInfo(String bookName, String writer, String Genre, int numbersOfPages) {
        super(bookName, writer, Genre, numbersOfPages);
    }

    public void printLibrary() {

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
                String name = sc.nextLine();
                BookService.createNewLibrary(name);
                System.out.println("каталог " + name + " создан");
                break;
            case 2:
                System.out.println("Название каталога книг: ");
                name = sc.nextLine();
                BookService.removeLibrary(name);
                System.out.println("Каталог " + name + " удален");
                break;
            case 3:
                System.out.println("Название каталога книг: ");
                name = sc.nextLine();
                printLibraryList(name);
                System.out.println(Library.setNameLibrary(name);
                break;
            case 4:
                addBook();
                break;
            case 5:
                removeBook(bookName);
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