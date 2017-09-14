package com.testtask.task10;

import com.testtask.scanner.ScannerSingleTone;

import java.util.*;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class TaskTen {
    private static Scanner scanner = ScannerSingleTone.getInstance().getScanner();

    public void inputNumber() {

        try {
            System.out.println("Введите три целых числа:");

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int[] array={a,b,c};
            combination(array);


        } catch (Exception ex) {
            System.out.println("Некорректно введены данные");
        } finally {
            scanner.close();
        }
    }

    private void combination(int[] arr) {
        Set<Integer> combo=new HashSet<Integer>();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                sb=new StringBuilder(""+arr[0]+arr[1]+arr[2]);
                combo.add(Integer.parseInt(sb.toString()));
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
        outPut(combo);
    }

    private void outPut(Set<Integer> set){
      List<Integer> sortList=new ArrayList(set);
      Collections.sort(sortList);

        for(Integer i:sortList){
            System.out.println(i.toString());
        }

    }



}

