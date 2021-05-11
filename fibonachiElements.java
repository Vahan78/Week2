package day1;

import java.util.Scanner;

public class fibonachiElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int inputNumber = scanner.nextInt();

        System.out.println (fibonachiElements(inputNumber));

    }





        public static int fibonachiElements (int n){
        int a=0;
        int b=1;
        int c=0;
        for (int i=0; i<n; i++){
            c = a + b;
            a = b;
            b = c;}
        return c;

        }
    }


