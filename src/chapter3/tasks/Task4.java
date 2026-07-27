package chapter3.tasks;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        String inputWord, reversedWord;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Word: ");
        inputWord = scan.nextLine().toLowerCase().trim();
        StringBuilder reversed = new StringBuilder(inputWord.length());

        for(int x = inputWord.length()-1; x >= 0; x--) {
            reversed.append(inputWord.charAt(x));
        }
        reversedWord = reversed.toString();
        System.out.println(inputWord.equals(reversedWord)
                ? "The input string is a palindrome" : "The input string is not a palindrome");
    }
}