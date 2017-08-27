package Graphs;

import java.util.Arrays;

/**
 * Created by artur on 27.08.2017.
 */
public class PrintStructures {

    public static void printA(boolean[][] matrixA) {
        for (int i = 0; i < matrixA.length; i++) {
            System.out.println(Arrays.toString(matrixA[i]));
        }
    }

    public static void printE(Edge[] edgesArray) {
        for (Edge item: edgesArray) {
            System.out.println(item);
        }
    }

    public static void printE2(Edge2[] edgesArray) {
        for (Edge2 item: edgesArray) {
            System.out.println(item);
        }
    }
}
