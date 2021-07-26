package com.company.view;

import com.company.Library;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Output extends Library {

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
