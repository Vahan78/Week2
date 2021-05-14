package day3;

import java.util.Scanner;

public class T5ReversString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text");
        String inputText = scanner.nextLine();

        ret(inputText);
    }

    public static void ret(String a) {
        StringBuffer strBufer = new StringBuffer(a);
        strBufer.reverse();
        System.out.println("The reverse of the String \"" + a  + "\" is \"" + strBufer.toString() +"\"");

    }
}