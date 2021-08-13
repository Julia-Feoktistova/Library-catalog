package com.repository;

import java.awt.print.Book;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Создание и изменение коллекции каталог
 */
public class Library implements Serializable {

    private String nameLibrary;

    @Serial
    private static final long serialVersionUID = 2L;


    private List<Book> libraryList = new ArrayList<Book>();

    public List<Book> getLibraryList() {
        return libraryList;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }
    public static void setNameLibrary(String nameLibrary) {
        System.out.println("Название каталога: " + nameLibrary);
    }
}

