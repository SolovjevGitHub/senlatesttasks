package com.testtask.task8;

import com.testtask.scanner.ScannerSingleTone;

import java.util.Scanner;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class TaskEight {
    private static Scanner scanner = ScannerSingleTone.getInstance().getScanner();

    public void inputLenght() {

        try {
            System.out.println("Для последовательности от 0 до N введите N:");

            int n = scanner.nextInt();
            numberIsPolindrome(n);


        } catch (Exception ex) {
            System.out.println("Некорректно введены данные");
        } finally {
            scanner.close();
        }
    }

    private void numberIsPolindrome(int n) {
        StringBuilder sb = null;
        if (n > 10) {
            for (int i = 10; i <= n; i++) {
                sb = new StringBuilder(i + "");
                sb.reverse();
                if (i == Integer.parseInt(sb.toString())) {
                    System.out.println("Число " + i + " является полиндромом");
                }

            }
        } else {
            System.out.println("В заданном диапазоне нет чисел-полиндром");
        }
    }
}
