package com.testtask.task4;

import com.testtask.scanner.ScannerSingleTone;


import java.util.Arrays;
import java.util.Scanner;


public class TaskFour {
    private static Scanner scanner = ScannerSingleTone.getInstance().getScanner();

    public void inputText() {
        System.out.println("Введите текст:");
        try {
            String input = scanner.nextLine();
            splitText(input);


        } catch (Exception ex) {
            System.out.println("Некорректно введены данные");
        } finally {
            scanner.close();
        }

    }

    private void splitText(String inputText) {
        String[] wordAr = inputText.split("[,. ]+");
        System.out.println("");
        System.out.println("Все слова в предложении:");

        for (int i = 0; i < wordAr.length; i++) {
            wordAr[i] = wordAr[i].toLowerCase();
            System.out.println(wordAr[i]);
        }
        wordCount(wordAr);
        sortArray(wordAr);
    }

    private void wordCount(String[] array) {
        System.out.println("");
        System.out.println("Кол-во слов в предложении: " + array.length);

    }

    private void sortArray(String[] array) {
        Arrays.sort(array);
        System.out.println("");
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i] + " ");
        }


    }
}
