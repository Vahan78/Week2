package day2;

public class DataTayps {


    public static int sum(int a, int b) {
      int sum = a + b;
        return sum;

    }
    public static float sum(int a, float b){
        float sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 8));
        System.out.println(sum(3, 4.5f));
    }
}