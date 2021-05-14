package day3;

public class T3CheckChar {
    public static void main(String[] args) {
        int result = check("hello", 'p');
        if(result != -1) {
            System.out.println("Given");
        }else System.out.println("Not given");
    }

    public static int check(String str, char ch) {
        return str.indexOf(ch);
    }

}
