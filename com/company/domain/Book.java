package company.domain;

public class Book {

    public String bookName;
    public String writer;
    public int numbersOfPages;
    public String Genre;


    public Book(String bookName, String writer, String Genre,  int numbersOfPages) {
        this.bookName = bookName;
        this.writer = writer;
        this.numbersOfPages = numbersOfPages;
        this.Genre = Genre;
    }

    public static void getName(String bookName) {
        System.out.println("Книга: " + bookName);
    }

    public static void getWriter(String writer) {
        System.out.println("Автор: " + writer);
    }

    public static void getNumbersOfPages(int numbersOfPages) {
        System.out.println("Кол-во страниц: " + numbersOfPages);
    }

}

