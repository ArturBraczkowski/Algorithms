package Helpers;

import java.util.Scanner;

/**
 * Created by artur on 19.08.2017.
 */
public class Helper {
    public static int[] getArrayFromUser() {

        System.out.println("Podaj wielkość tablicy: ");
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();

        int[] arrayN = new int[n];

        for (int i = 0; i < arrayN.length; i++) {
            System.out.println("Podaj kolejną liczbę");
            arrayN[i] = myScanner.nextInt();

        }
        return arrayN;
    }

    public static int[] getArrayFromUserBySize() {
        System.out.println("Podaj wielkosc tablicy");
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();

        int[] arrayN = new int[n - 1];

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = i + 2;

        }
        return arrayN;
    }

    public static void printArray(int[] arrayN) {
        for (int i = 0; i < arrayN.length; i++) {
            System.out.println(arrayN[i]);

        }

    }

    public static String getStringFromUser(String info) {

        System.out.println("Podaj wielkosc tablicy");
        Scanner myScanner = new Scanner(System.in);
        String result = myScanner.nextLine();
        return result;

    }

    public static void printInt(int n) {
        System.out.println(n);
    }

    public static void printString (String s) {
        System.out.println(s);
    }
}
