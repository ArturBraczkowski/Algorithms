//package RandomNK;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class RandomNK {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("podaj liczbe elementow tablicy: ");
//        int size = scanner.nextInt();
//        System.out.println("Podaj liczbe losowań: ");
//        int k = scanner.nextInt();
//
//        int [] array = new int [size];
//
//        for (int i = 0; i < size; i++) {
//            System.out.println("Podaj element nr " + i);
//            array[i] = scanner.nextInt();
//
//        }
//        int[] result = new int [k];
//    }
//    public static int [] randomNK (int[] inputArray, int k) {
//        int [] result = new int[k];
//        int index = inputArray.length -1;
//        Random random = new Random();
//        while(k > 0){
//            int r = random.nextInt(index);
//            //result [k] = inputArray[r];
//            int tempVar = inputArray [r];
//            inputArray[r] = inputArray[index];
//            inputArray[index] = tempVar;
//            //index--;
//            k--;
//        }
//
//        return result;
//    }
//}

package RandomNK;

import java.util.Random;
import java.util.Scanner;

public class RandomNK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe elememntow tablicy: ");
        int size = scanner.nextInt();
        System.out.println("Podaj liczbe losowan: ");
        int k = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Podaj element nr " + i);
            array[i] = scanner.nextInt();
        }
        int[] result = randomNK(array, k);  //niedokonczony kod
        for (int i = result.length; i > result.length - k; i--) {
            System.out.println("Wylosowany element:" + result[i]);

        }

    }


    public static int[] randomNK(int[] inputArray, int k) {

        int index = inputArray.length - 1;
        Random random = new Random();
        int temp;
        while (k > 0) {
            int r = random.nextInt(index);
            int tempVar = inputArray[r];
            temp = inputArray[r];
            inputArray[r] = inputArray[index];
            inputArray[index] = temp;

            index--;
            k--;
        }
        return inputArray;
    }
}
