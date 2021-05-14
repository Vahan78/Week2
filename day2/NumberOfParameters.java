package day2;

public class NumberOfParameters {
    public static void main(String[] args) {
        System.out.println(add(4, 9));
        System.out.println(add(1, 2, 4));
    }
    public static int add(int a, int b){
        int add = a + b;
        return  add;
    }

    public static int add(int a, int b, int c) {
        int add = a + b + c;
        return  add;

    }
}
