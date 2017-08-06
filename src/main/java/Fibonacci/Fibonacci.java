package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz liczbę: ");
        int x=scanner.nextInt();

        System.out.println("Wartosc Fibonacci: " + fibonacci(x));
    }

    public static int fibonacci (int x) {

        if (x<= 2) {
            return 1;
        } else {
            return fibonacci (x- 2) + fibonacci(x-1);
        }
    }
}
