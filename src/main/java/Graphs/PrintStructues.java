package Graphs;

import java.util.Arrays;

/**
 * Created by artur on 20.08.2017.
 */
public class PrintStructues {

    public static void printA (boolean[][] matrixA) {

        for (int i = 0; i < matrixA.length; i++) {
           // System.out.println(matrixA[i]);
            System.out.println(Arrays.toString(matrixA[i]));
        }

    }
}
