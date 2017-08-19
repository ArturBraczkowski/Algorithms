package Helpers;

import java.util.Scanner;

/**
 * Created by artur on 19.08.2017.
 */
public class Helper {
    public static int [] getArrayFromUser () {

            System.out.println("Podaj wielkość tablicy: ");
            Scanner myScanner = new Scanner(System.in);
            int n = myScanner.nextInt();

            int [] arrayN = new int [n];

            for (int i = 0; i < arrayN.length; i++) {
                System.out.println("Podaj kolejną liczbę");
                arrayN[i] = myScanner.nextInt();

            }return arrayN;
    }

    public static void printArray (int[] arrayN) {
        for (int i = 0; i <arrayN.length ; i++) {
            System.out.println(arrayN[i]);

        }

    }
}
