package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    private String nameLibrary;
    private ArrayList list_library; //to do сделать через лист

    public Library() {
    }

    public void setNameLibrary(String nameLibrary) {
        this.nameLibrary = nameLibrary;
    }

    class Book {
        private String bookName;
        private String writer;
        private int numbersOfPages;
        private String genre;

        public Book(String bookNames, String writer, String genre, int numbersOfPages) {
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
}

