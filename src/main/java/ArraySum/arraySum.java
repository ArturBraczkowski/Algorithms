package ArraySum;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by artur on 06.08.2017.
 */
public class arraySum {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy: ");
        int size = myScanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            System.out.println("podaj element nr: " + i);
            array.add (myScanner.nextInt());

        }
        System.out.println("Wynik: " + getArraySum(array));


    }
    public static int getArraySum(ArrayList<Integer> array) {
        int result = 0;
        for (int i = 0; i < array.size() ; i++) {
            result += array.get(i);
        } return  result;

        }
    }

