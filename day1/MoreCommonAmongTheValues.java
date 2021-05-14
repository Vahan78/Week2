package day1;

import java.util.Scanner;

public class MoreCommonAmongTheValues {

    public static boolean morCommon(boolean x, boolean y, boolean z) {
        if (x && y) {
            return x;
        } else if (x && z) {
            return x;
        } else return y;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x");
        boolean x = scanner.nextBoolean();
        System.out.println("Input y");
        boolean y = scanner.nextBoolean();
        System.out.println("input z");
        boolean z = scanner.nextBoolean();
        boolean morCommon = morCommon(x, y, z);
        System.out.println(morCommon);
    }
}