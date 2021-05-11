package day1;

import java.util.Scanner;

public class SmallestOfTheGivenFourNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Number A");
        int inputNumberA = scanner.nextInt();

        System.out.println("input Number B");
        int inputNumberB = scanner.nextInt();

        System.out.println("input Number C");
        int inputNumberC = scanner.nextInt();

        System.out.println("input Number D");
        int inputNumberD = scanner.nextInt();

        int res = min(inputNumberA, inputNumberB, inputNumberC, inputNumberD); // kancheci min funkcian
        System.out.println("minimal number is " + res);
    }



    public static int min(int a, int b, int c, int d) {                      // min funkcian

        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = c;
        return min;
    }


}




