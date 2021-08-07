package com.company.service;

import com.company.domain.Book;
import com.company.domain.Genre;
import com.company.domain.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService {

    Scanner scanner = new Scanner(System.in);

    public void createNewLibrary() {
        Library library = new Library();
        System.out.println("Введите название каталога");
        Library.setNameLibrary(scanner.nextLine());//todo Установить имя нового каталога
    }

    public void removeLibrary(String nameLibrary, Library library) {
        System.out.println("Введите название каталога, который хотите удалить");
        library.setNameLibrary(nameLibrary) = null; //todo обнулить значение каталога
        System.gc();
    }


}
