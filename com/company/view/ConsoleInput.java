package com.company.view;

import company.domain.Genre;
import java.util.Scanner;

public class ConsoleInput {


    public void printGenre(String genre) {
        Scanner scanGenre = new Scanner(System.in);
        System.out.println("Выберите жанр: 1 - детектив" + System.lineSeparator() +
                "2 - комедия" + System.lineSeparator() + "2 - фантастика" + System.lineSeparator() +
                        "4 - фэнтези" + System.lineSeparator() + "5 - Романтика" + System.lineSeparator() +
                        "6 - научная литература");
        int genreSelect = scanGenre.nextInt();
        switch (genreSelect) {
            case 1:
                System.out.println("Книги по жанру " + Genre.DETECTIVE + ": " + );
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:
        }
    }


   /* public void printAllCatalog() {
        if (libraryList != 0)
            System.out.println("Название каталога книг : " + nameLibrary + "\nКоличество книг в сборнике: "
            );
        try {
            for (int i = 0; i < libraryList; i++) {
                System.out.print(" Наименование " + (i + 1) + "-й книги в каталоге: " + this.libraryList[i].getNames() + "; ");
                System.out.print(" Писатель: " + this.libraryList[i].getWriter() + "; ");
                System.out.println("Количество страниц: " + this.libraryList[i].getNumbers() + "; ");
                String source = " Наименование " + (i + 1) + "-й книги: " + this.libraryList[i].getNames() + "; "
                        + System.lineSeparator() + "Автор " + (i + 1) + "-й книги: " + this.libraryList[i].getWriter() + "; "
                        + System.lineSeparator() + "Жанр: " + this.libraryList[i].getGenre() + "; " + System.lineSeparator()
                        + "Кол-во страниц " + (i + 1) + "-й книги: " + this.libraryList[i].getNumbers() + "; ";

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
            if (libraryList.length == 0) {
                System.out.println("Ошибка!!! Попробуйте начать сначала!!!");
            }
        }
    } */
}
