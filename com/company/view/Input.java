package com.company.view;

import com.company.domain.Book;
import com.company.domain.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        ArrayList libraryList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        public void setCatalog(ArrayList libraryList) {

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

        public void printGenre(Book.Genre){
            System.out.println("Выберите жанр: 1 - детектив" + System.lineSeparator() +
                    "2 - комедия" + System.lineSeparator() + "2 - фантастика" + System.lineSeparator() +
                    "4 - фэнтези" + System.lineSeparator() + "5 - Романтика" + System.lineSeparator() +
                    "6 - научная литература");
            int genreSelect = sc.nextInt();
            switch (genreSelect) {
                case 1:
                    System.out.println("Книги по жанру " + Book.Genre.DETECTIVE.getGenre() + );
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
}
