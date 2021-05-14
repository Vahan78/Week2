package day1;

import java.util.Scanner;

public class LogicalXor {
    public static boolean xor(boolean b1, boolean b2){
        if(b1 && b2) {
            return false;
        }else if(!b1 && !b2){
            return false;
        }else return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input true or false");
        boolean a = scanner.nextBoolean();
        System.out.println("Input true or false");
        boolean b = scanner.nextBoolean();
        boolean xor = xor(a, b);
        System.out.println(xor);

    }
}

