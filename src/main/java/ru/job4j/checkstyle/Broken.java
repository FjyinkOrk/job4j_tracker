package ru.job4j.checkstyle;

public class Broken {
    private int sizeofempty = 10;
    public String surname;
    String name;
    public static final String NEWVALUE = "";

    void method(int a, int b, int c, int d, int e, int f, int g) {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}