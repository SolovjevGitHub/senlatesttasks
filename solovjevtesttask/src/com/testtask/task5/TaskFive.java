package com.testtask.task5;

import com.testtask.scanner.ScannerSingleTone;

import java.util.Scanner;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class TaskFive {
    private static Scanner scanner = ScannerSingleTone.getInstance().getScanner();

    public void inputText() {

        try {
            System.out.println("Введите текст:");
            String inputText = scanner.nextLine();
            System.out.println("Введите слово, которое нужно найти в тексте.");
            String inputWord = scanner.next();
            searchWord(inputText,inputWord);


        } catch (Exception ex) {
            System.out.println("Некорректно введены данные");
        } finally {
            scanner.close();
        }

    }

    private String[] splitText(String text) {
        return text.split("[!?,. ]+");
    }

    private void searchWord(String text, String word) {
        int count = 0;
        String[] wordAr = splitText(text);
        for (int i = 0; i < wordAr.length; i++) {
            if (wordAr[i].equalsIgnoreCase(word)) {
                count++;
            }
        }
        System.out.println("Слово " + word + " встречалось в тексте " + count + " раз");

    }
}
