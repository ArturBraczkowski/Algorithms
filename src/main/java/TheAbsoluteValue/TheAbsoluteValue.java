package TheAbsoluteValue;

import java.util.Scanner;


public class TheAbsoluteValue {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int number;
        int result;

        System.out.println("Podaj liczbe");
        number = myScanner.nextInt();

        result = getAbsolute (number);

        System.out.println("wynik to: " + result);
    }
    public static int getAbsolute(int number) {
        int result;
        if(number > 0) {
            result = number;

        }
        else {
            result = number * -1;
        }
        return result;
    }

}
