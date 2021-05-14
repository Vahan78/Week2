package day2;

import java.util.Scanner;

public class squarMethod {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        float c = 7.8f;
        int s = 0;

        System.out.println(squer(5));

        System.out.println(squer(5, 8));

        System.out.println(squer(5,7.8f));


    }

    public static int squer(int a) {
        int s = a * a;
        return s;
    }
    public  static  int squer(int a, int b){
        int s = a * b;
        return s;
    }
    public  static  double squer( int a, float c){
        double s = a * Math.PI;
        return s;
    }


}
