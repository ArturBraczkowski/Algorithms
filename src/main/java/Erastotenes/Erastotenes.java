package Erastotenes;

import Helpers.Helper;

/**
 * Created by artur on 19.08.2017.
 */
public class Erastotenes {
    public static void main(String[] args) {
        int [] arrayN = Helper.getArrayFromUserBySize();

        Helper.printArray(arrayN);


    }

    private static int[] doErastotenes(int[] arrayN) {
        int sqrt = (int) Math.floor((Math.sqrt (arrayN[arrayN.length-1])));


        for (int i = 0; i < arrayN.length - 1; i++) {
            for (int j = i + 1; j < arrayN.length - 1; j++) {
                if (arrayN[i] !=0 && arrayN[j] !=0 && arrayN[j] % arrayN[i] ==0 ) {
                    arrayN[j] = 0;
                }
            }
            if (arrayN[i] > sqrt) {
                break;
            }

        }
        return arrayN;
    }
}
