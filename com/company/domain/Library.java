package com.company.domain;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {

    protected String nameLibrary;
    protected List<Book> libraryList = new ArrayList<>();

    public String getNameLibrary() {
        return nameLibrary;
    }

    public void setNameLibrary(String nameLibrary) {
        this.nameLibrary = nameLibrary;
    }

    public void setLibraryList(List<Book> libraryList) {
        this.libraryList = libraryList;
    }
}

