package day2;

import java.util.Random;

public class MassivIntFloatDouble {
    public static void main(String[] args) {
        int[] arrayI = {11, 22, 33, 44, 55};
        float[] arrayF = {1.1f, 2.2f, 3.3f, 4.4f};
        double[] arrayD = {5.55, 6.45, 7.89, 4.32};
        array(arrayI);
        array(arrayF);
        array(arrayD);
    }

    public static void array(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length-1)
                System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }


    public static void array(float[] f) {
        System.out.print("[");
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i]);
            if (i < f.length-1)
                System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void array(double[] d){
        System.out.print("[");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]);
            if (i < d.length-1)
                System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }
}




