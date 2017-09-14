package com.testtask.task9;

import com.testtask.scanner.ScannerSingleTone;

import java.util.Scanner;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class TaskNine {
    private static Scanner scanner = ScannerSingleTone.getInstance().getScanner();
    private int summa;

    public void inputLenght() {

        try {
            System.out.println("Для последовательности от 0 до N введите N:");

            int n = scanner.nextInt();
            isEvenNumber(n);
            System.out.println("\n"+"Сумма все чётных чисел в данном промежутке = "+summa);


        } catch (Exception ex) {
            System.out.println("Некорректно введены данные");
        } finally {
            scanner.close();
        }
    }
    private void isEvenNumber(int n){
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.print(i+",");
                summ(i);
            }
        }
    }
    private void summ(int n){
        summa+=n;

    }
}
