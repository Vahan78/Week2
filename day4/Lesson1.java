package day4;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println(count(3));
    }
    static int count(int n){
        if(n==1)
            return 1;
        return n + count(n-1);
    }


    public static void fact(String[] args) {


    }
}