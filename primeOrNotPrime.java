package day1;

import java.util.Scanner;

public class primeOrNotPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
    int inputNumber = scanner.nextInt();
        System.out.println(primeOrNot(inputNumber));

    }

            public static boolean primeOrNot ( int inputNumber){
            boolean flag = true;
            for (int i = 2; i <Math.sqrt(inputNumber); i++)           // Math.sqrt tvi qarakusi armat
                if (inputNumber % i == 0) {
                    flag = false;
                      return flag;
                }
            flag = true;
            return flag;
        }
    }
