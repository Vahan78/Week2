package day2;

public class maxNumb {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int d = 9;
        System.out.println(squer(5,6));
        System.out.println(squer(5,6,7));
        System.out.println(squer(5,6,7,9));

    }

    public static int squer(int a, int b) {
        int x = a;
        if (x < b)
            x = b;

        return x;

    }

    public static int squer(int a, int b, int c) {
        int x = a;
        if (x < b)
            x = b;
        if (x < c)
            x = c;


        return x;

    }

    public static int squer(int a, int b, int c, int d) {
        int x = a;
        if (x < b)
            x = b;
        if (x < c)
            x = c;
        if (x < d)
            x = d;


        return x;

    }

}