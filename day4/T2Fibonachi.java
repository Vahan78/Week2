package day4;

public class T2Fibonachi {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
    public static int fibonacci(int n){

        if (n<=1){
            return (n);
        }
        return fibonacci(n-2) + fibonacci(n-1);

    }
}
