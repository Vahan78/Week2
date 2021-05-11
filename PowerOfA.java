package day1;

import java.util.Scanner;

public class PowerOfA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int inputNumber = scanner.nextInt();
        System.out.println("Input power");
        int inputPower = scanner.nextInt();

        System.out.println(a(inputNumber, inputPower));     //int res = a(int inputNumber, int inputPower)
                                                            // System.out.println(res);

    }


    public static int a(int inputNumber, int inputPower) {
        int a = 1;
        for (int i = 1; i <= inputPower; i++) {
            a = inputNumber * a;
        }
        return a;
    }
}




