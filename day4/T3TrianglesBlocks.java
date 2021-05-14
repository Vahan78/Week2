package day4;

import java.util.Arrays;
import java.util.Scanner;

public class T3TrianglesBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Triangle (" + n +") = " + count(n));

        //System.out.println(count(4));
    }

    static int count(int n) {
        if (n == 0)
            return 0;

        return n + count(n - 1);

    }
}



