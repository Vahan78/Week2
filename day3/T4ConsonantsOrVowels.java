package day3;

import java.util.Locale;
import java.util.Scanner;

public class T4ConsonantsOrVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text");
        String inputText = scanner.nextLine();
        System.out.println(vowelsAndConsonant(inputText)+" vowels");
        System.out.println(vowelsAndConsonant(inputText, 1)+ " consonants");


    }

    public static int vowelsAndConsonant(String text) {
        String newText = text.toLowerCase(Locale.ROOT);
        int count = 0;
        for (int i = 0; i < newText.length(); i++) {
            if (newText.charAt(i) == 'a' || newText.charAt(i) == 'e' || newText.charAt(i) == 'i' ||
                    newText.charAt(i) == 'o' || newText.charAt(i) == 'u') {
                count++;
            }

        }
        return count;
    }

    public static int vowelsAndConsonant(String text, int num) {

        String newText = new String(text.replaceAll("^a-zA-Z", ""));
        int count = 0;
        for (int i = 0; i < newText.length(); i++) {
            if (newText.charAt(i) == 'a' || newText.charAt(i) == 'e' || newText.charAt(i) == 'i' ||
                    newText.charAt(i) == 'o' || newText.charAt(i) == 'u') {
                count++;
            }
        }
        return newText.length() - count;

    }

}
