package com.company.view;

import com.company.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Input extends Library {

    public void setCatalog() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество книг в текущем сборнике:");
        int k = sc.nextInt();
        list_library = new ArrayList();
        for (int i = 0; i < list_library.length; i++) {
            System.out.println("Название  " + (i + 1) + "-й книги: ");
            String bookNames = sc.next();
            System.out.println("Введите автора: ");
            String writer = sc.next();
            System.out.println("Введите жанр книги: ");
            String genre = sc.next();
            System.out.println("Количество страниц: ");
            int numbersOfPages = sc.nextInt();
            list_library[i] = new ArrayList<Object>(bookNames, writer, genre, numbersOfPages);
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
}
