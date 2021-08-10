package company.domain;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private String nameLibrary;
    private List<Book> libraryList = new ArrayList<>();

    public List<Book> getLibraryList() {
        return libraryList;
    }

    public static void setNameLibrary(String nameLibrary) {
        System.out.println("Название каталога: " + nameLibrary);
    }
}

