package day2;

public class ArrayNumberIndex {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        int numb = 4;
        int index = 3;
        System.out.println("Array size is:" + array(array));
        System.out.println("Index of number:" + arrary(array, numb));

        System.out.println("it`s: " + array(array, numb, index));
    }

    public static int array(int[] array) {
        return array.length;
    }

    public static int arrary(int[] array, int numb) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numb) {
                return i;
            }
        }

        return 404;

    }

    public static boolean array(int[] array, int numb, int index) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numb && index == i) {
                return true;

            }

        }
        return false;
    }
}
