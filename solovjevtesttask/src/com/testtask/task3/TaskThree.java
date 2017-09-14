package com.testtask.task3;

import com.testtask.scanner.ScannerSingleTone;

import java.util.Scanner;


public class TaskThree {
    private static Scanner scanner = ScannerSingleTone.getInstance().getScanner();

    public void inputWord() {
        System.out.println("Введите слово:");
        try {
            String word = scanner.nextLine();
            isPalindrome(word);

        } catch (Exception ex) {
            System.out.println("Некорректно введены данные");
        } finally {
            scanner.close();
        }

    }

    private void isPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        if (word.equalsIgnoreCase(stringBuilder.reverse().toString())) {
            System.out.println("Слово " + word + " является словом полиндромом");
        } else {
            System.out.println("Слово " + word + " не является словом полиндромом");
        }

    }
}
