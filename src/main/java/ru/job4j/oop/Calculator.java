package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int a) {
        return x / a;
    }

    public static void main(String[] args) {
        int result = Calculator.minus(5);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.divide(5);
        System.out.println(rsl);
    }
}
