package day2;

import java.util.Arrays;
import java.util.Random;

public class Lesson1 {

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        init(matrix);
        int x = sum(matrix);

        int[] array = new int[10];
        init(array);
        int y = sum(array);

        System.out.println(x + " " + y);
    }

    public static void init(int[][] matr) {
        Random random = new Random();
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = random.nextInt();
            }
        }


    }

    public static int sum(int[][] matrix) {
        int matrixSum = 0;
        for (int[] ints : matrix) {

            for (int j = 0; j < matrix.length; j++) {
                matrixSum = matrixSum + ints[j];
            }
        }
        return matrixSum;

    }

    public static int sum(int[] array) {
        int arraySum = 0;
        for (int j : array) {
            arraySum = (arraySum + j) / array.length;
        }
        return arraySum;
    }

    public static void init(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();

        }

    }


}





