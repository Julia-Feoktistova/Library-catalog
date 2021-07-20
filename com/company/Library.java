package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Library {

    private String nameLibrary;
    private ListLibrary[] list_library;

    public Library() {
    }

    public void setNameLibrary(String nameLibrary) {
        this.nameLibrary = nameLibrary;
    }

    class ListLibrary {
        private String bookName;
        private String writer;
        private int numbersOfPages;
        private String genre;

        public ListLibrary(String bookNames, String writer, String genre, int numbersOfPages) {
            this.bookName = bookNames;
            this.writer = writer;
            this.genre = genre;
            this.numbersOfPages = numbersOfPages;
        }

        public String getNames() {
            return this.bookName;
        }

        public String getWriter() {
            return this.writer;
        }

        public String getGenre() {
            return this.genre;
        }

        public int getNumbers() {
            return this.numbersOfPages;
        }

    }

    public void setCatalog() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество книг в текущем сборнике:");
        int k = sc.nextInt();
        list_library = new ListLibrary[k];
        for (int i = 0; i < list_library.length; i++) {
            System.out.println("Название  " + (i + 1) + "-й книги: ");
            String bookNames = sc.next();
            System.out.println("Введите автора: ");
            String writer = sc.next();
            System.out.println("Введите жанр книги: ");
            String genre = sc.next();
            System.out.println("Количество страниц: ");
            int numbersOfPages = sc.nextInt();
            list_library[i] = new ListLibrary(bookNames, writer, genre, numbersOfPages);
        }
    }

    public void printGenre(String genre) {
        Scanner scanGenre = new Scanner(System.in);
        System.out.println("Введите жанр который хотите вывести на экран: ");
        String genreSelect = scanGenre.next();
        if (genreSelect.equals(genre)) {
            System.out.println("Книги по жанру " + genreSelect + ": ");
            try {
                for (int i = 0; i < list_library.length; i++) {
                    System.out.println("Наименование " + (i + 1) + this.list_library[i].getNames());
                }
            } catch (Exception e) {
                System.out.println("Такого жанра в саталоге не существует");
            }
        }
    }

    public void printAllCatalog() {
        if (list_library.length != 0)
            System.out.println("Название каталога книг : " + this.nameLibrary + "\nКоличество книг в сборнике: "
                    + list_library.length);
        try {
            for (int i = 0; i < list_library.length; i++) {
                System.out.print(" Наименование " + (i + 1) + "-й книги в каталоге: " + this.list_library[i].getNames() + "; ");
                System.out.print(" Писатель: " + this.list_library[i].getWriter() + "; ");
                System.out.println("Количество страниц: " + this.list_library[i].getNumbers() + "; ");
                String source = " Наименование " + (i + 1) + "-й книги: " + this.list_library[i].getNames() + "; "
                        + System.lineSeparator() + "Автор " + (i + 1) + "-й книги: " + this.list_library[i].getWriter() + "; "
                        + System.lineSeparator() + "Жанр: " + this.list_library[i].getGenre() + "; " + System.lineSeparator()
                        + "Кол-во страниц " + (i + 1) + "-й книги: " + this.list_library[i].getNumbers() + "; ";

                File myFile = new File("C:/Library/Book.txt");

                System.out.println("Удалаяем файлы если они уже были созданы.");
                if (myFile.exists()) {
                    myFile.delete();
                }

                File fp = new File("C:\\Library");
                System.out.println("Создаем дерикторию C:\\Library");
                System.out.println("Проверяем: ");
                fp.mkdirs();
                if (fp.exists()) {
                    System.out.println("Каталог " + fp.getName() + " существует.");
                }
                try {
                    FileWriter f2 = new FileWriter("C:/Library/Book.txt", true);
                    f2.write(source);
                    f2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Выполнено успешно.");
            }
        } catch (Exception e) {
            if (list_library.length == 0) {
                System.out.println("Ошибка!!! Попробуйте начать сначала!!!");
            }
        }
    }
}

