package day4;

public class T1ArrayFactorial {
    public static void man(String[] args) {

        System.out.println(f(5));
    }

    static int f(int n) {
        if (n == 0)
            return 1;
        return n * f(n - 1);
    }


    public static void main(String[] args) {
        int array[] = {3, 4, 6, 7, 10, 5};
        System.out.println(sum(array, array.length - 1));

    }

    public static int sum(int[] array, int index) {
        if (index == 0) {
            return array[0];
        } else {
            return array[index] + sum(array, index - 1);
        }
    }
}



