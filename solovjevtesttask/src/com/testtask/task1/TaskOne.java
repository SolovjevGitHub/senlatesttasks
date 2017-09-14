package com.testtask.task1;

import com.testtask.scanner.ScannerSingleTone;

import java.util.Scanner;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class TaskOne {
    private static Scanner scanner = ScannerSingleTone.getInstance().getScanner();

    public void inputNumber() {
        System.out.println("Введите целое число:");
        try {
            int number = scanner.nextInt();
            isPrimeNumber(number);
            isEvenNumber(number);


        } catch (Exception ex) {
            System.out.println("Некорректно введены данные");
        } finally {
            scanner.close();
        }

    }

    private void isEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Введённое число - чётное");
        } else {
            System.out.println("Введённое число - нечётное");
        }
    }

    private void isPrimeNumber(int number) {
        if (number != 0 & number != 1) {

            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {

                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Число " + number + " является простым");
            } else System.out.println("Число " + number + " является составным ");
        } else {
            System.out.println("0(ноль) или 1 не является ни простым, ни составным числом");
        }

    }

}


