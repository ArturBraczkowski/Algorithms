package SmallestDivisor;

import java.util.Scanner;

/**
 * Created by artur on 06.08.2017.
 */
public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int valueA;
        int valueB;


        System.out.println("Podaj liczbe A: ");
        valueA = myScanner.nextInt();
        System.out.println("Podaj liczbe B ");
        valueB = myScanner.nextInt();

        System.out.println(getSmallestDivisor(valueA, valueB));
    }

    public static int getSmallestDivisor(int a, int b) {
        while (a != b) {

            if (a < b) {
                a = a - b;

            } else {
                b = b - a;

            }
        }
        return a;
    }
}

