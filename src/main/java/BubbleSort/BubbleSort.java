package BubbleSort;

import java.util.Scanner;

/**
 * Created by artur on 19.08.2017.
 */
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Podaj wielkość tablicy: ");
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();

        int [] arrayN = new int [n];

        for (int i = 0; i < arrayN.length; i++) {
            System.out.println("Podaj kolejną liczbę");
            arrayN[i] = myScanner.nextInt();

        }
        //Bubble Sort
        arrayN = doBubbleSort(arrayN);

        for (int i = 0; i < arrayN.length; i++) {
            System.out.println(arrayN[i]);
        }

    }


    public static int[] doBubbleSort (int[] arrayN) {

        // 1 2 3 4

        int n = arrayN.length;
        boolean check = true;
        while (check) {

            check = false;
            for (int i = n - 1; i > 0; i--) {
                if (arrayN[i] < arrayN[i - 1]) {
                    int temp = arrayN[i];
                    arrayN[i] = arrayN[i - 1];
                    arrayN[i - 1] = temp;
                    check = false;
                }
            }
        }return arrayN;

    }

}
