package com.testtask.task2;

import com.testtask.scanner.ScannerSingleTone;

import java.util.Scanner;


public class TaskTwo {
    private static Scanner scanner = ScannerSingleTone.getInstance().getScanner();

    public void inputNumber() {
        System.out.println("Введите 2 целых числа");
        try {
            System.out.println("Первое число:");
            int number1 = scanner.nextInt();
            System.out.println("Второе  число:");
            int number2 = scanner.nextInt();
            System.out.println("Сумма введённых чисел равна " + summ(number1, number2));
            System.out.println("Разность введённых чисел равна " + difference(number1, number2));
            System.out.println("НОД для чисел " + number1 + ", " + number2 + " равен " + nod(number1, number2));
            System.out.println("НОК для чисел " + number1 + ", " + number2 + " равен " + nok(number1, number2));


        } catch (Exception ex) {
            System.out.println("Некорректно введены данные");
        } finally {
            scanner.close();
        }

    }

    private int summ(int number1, int number2) {
        return number1 + number2;
    }

    private int difference(int number1, int number2) {
        return number1 - number2;

    }

    private int nod(int number1, int number2) {
        int min;
        int nod = 0;
        if (number1 > number2) min = number2;
        else min = number1;
        for (int i = 1; i <= min; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                if (i > nod) nod = i;
            }
        }

        return nod;
    }

    private int nok(int number1, int number2) {
        return number1 / nod(number1, number2) * number2;
    }

}
