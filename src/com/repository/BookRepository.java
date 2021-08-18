package com.repository;

import com.domain.Book;

import java.io.*;

/**
 * репозиторий для работы с файлами
 */

public class BookRepository {

    private final String LIBRARY_FILE = "Library_Catalog.javaDoc";
    private Library library;
    public void addBookToFile(Book book)  {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Library_Catalog.javaDoc");
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(book);
            oss.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void getBookFromFile(Book book) {
        try {FileInputStream fis = new FileInputStream("Library_Catalog.javaDoc");
            ObjectInputStream ois = null;
            ois = new ObjectInputStream(fis);
            Book booksFromFile = ((Book) ois.readObject());
            ois.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Library getLibrary() {
        return library;
    }
}

/**
 * FileWriter fileWriter = null;
 *
 *     FileInputStream readEng = null;
 *     InputStreamReader readRuss = null;
 *     int biteInFile = 0;
 *
 *  try {  //создать файл
 *             File file = new File(LIBRARY_FILE);
 *             if (!file.exists()) {
 *                 file.createNewFile();
 *             }
 *         } catch (IOException exception) {
 *             System.out.println(exception.getMessage());
 *         }
 *         try { //записать в файл
 *             fileWriter = new FileWriter("Library_Catalog.javaDoc", true);
 *             fileWriter.write(String.valueOf(book));
 *         } catch (IOException exception) {
 *             exception.printStackTrace();
 *         } finally {
 *             try {
 *                 fileWriter.close();
 *             } catch (IOException exception) {
 *                 exception.printStackTrace();
 *             }
 *         }
 *
 *         try {
 *             readEng = new FileInputStream("Library_Catalog.javaDoc");
 *             readRuss = new InputStreamReader(readEng, "UTF-8");//русская кодировка
 *             while ((biteInFile = readEng.read()) != -1) {
 *                 System.out.print((char) biteInFile);
 *             }
 *         } catch (IOException e) {
 *             e.printStackTrace(); }
 *                 finally {
 *             try {
 *                 readEng.close();
 *             } catch (IOException exception) {
 *                 exception.printStackTrace();
 *             } try {
 *                 readRuss.close();
 *             } catch (IOException exception) {
 *                 exception.printStackTrace();
 *             }
 *         }
 *     }
 */