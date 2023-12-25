package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("White Fang", 500);
        Book book2 = new Book("Clean code", 400);
        Book book3 = new Book("Moby-Dick", 600);
        Book book4 = new Book("The Adventures of Tom Sawyer", 700);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (Book book : books) {
            System.out.println("Book " + book.getName() + " have size " + book.getNumberOfPages() + " pages");
        }
        System.out.println("Replace book index 0 to 3");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println("Book " + book.getName() + " have size " + book.getNumberOfPages() + " pages");
        }
        System.out.println("Shown only book name Clean code");
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println("Book " + book.getName() + " have size " + book.getNumberOfPages() + " pages");
            }
        }
    }
}

