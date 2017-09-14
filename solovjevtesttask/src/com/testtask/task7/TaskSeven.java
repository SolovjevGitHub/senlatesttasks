package com.testtask.task7;

import com.testtask.scanner.ScannerSingleTone;

import java.util.Random;
import java.util.Scanner;


public class TaskSeven {
    private static Scanner scanner = ScannerSingleTone.getInstance().getScanner();

    public void inputLenght() {

        try {
            System.out.println("Введите длину массива");
            int lenght = scanner.nextInt();
            int[] array=createArray(lenght);
            searchMax(array);
            searchMin(array);


        } catch (Exception ex) {
            System.out.println("Некорректно введены данные");
        } finally {
            scanner.close();
        }
    }

    private int[] createArray(int lenght) {
        int[] array = new int[lenght];
        Random random = new Random();
        for (int i = 0; i < lenght; i++) {
            array[i] = 10 + random.nextInt(100 - 10);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");

        }
        return array;

    }

    private void searchMin(int[] array) {
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println("\n"+"минимальное значение в массиве: "+min);
    }

    private void searchMax(int[] array) {
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("\n"+"Максимальное значение в массиве: "+max);
    }

}
