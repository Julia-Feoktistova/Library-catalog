package com.company;

import java.util.Scanner;

public class ListLibrary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вас приветствует автоматизированный книжный каталог. Выберите действие: " +
                "1 - создать новый каталог;" + System.lineSeparator() +
                "2 - отобразить содержимое каталога;" + System.lineSeparator() +
                "3 - отобразить книги в каталоге по жанру;" + System.lineSeparator() +
                "4 - сортировать алфавиту;" + System.lineSeparator() +
                "5 - сортировать по авторам по алфавиту;" + System.lineSeparator() +
                "6 - сортировать возрастанию количества страниц;" + System.lineSeparator() +
                "7 - сортировать по убыванию количества страниц");
        int userChoice = sc.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Название каталога книг: ");
                String name = sc.nextLine();
                Library library1 = new Library();
                library1.setNameLibrary(name);
                library1.setCatalog();
                break;
            case 2:
                library1.printAllCatalog();
                break;
            case 3:
                library1.printGenre();
                break;
            case 4:
            case 5:
            case 6:
            case 7:


        }
    }
}