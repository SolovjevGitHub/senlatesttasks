package com.testtask.task6;

import com.testtask.scanner.ScannerSingleTone;

import java.util.Scanner;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class TaskSix {
    private static Scanner scanner = ScannerSingleTone.getInstance().getScanner();

    public void input() {

        try {
            System.out.println("Введите три отрезка.");
            System.out.println("Введите отрезок x:");
            Double x = scanner.nextDouble();
            System.out.println("Введите отрезок y:");
            Double y = scanner.nextDouble();
            System.out.println("Введите отрезок z:");
            Double z = scanner.nextDouble();
            triangle(x,y,z);


        } catch (Exception ex) {
            System.out.println("Некорректно введены данные");
        } finally {
            scanner.close();
        }

    }

    public void triangle(Double x, Double y, Double z) {
        if (Math.pow(x, 2) == Math.pow(y, 2) + Math.pow(z, 2) || Math.pow(y, 2) == Math.pow(x, 2) + Math.pow(z, 2) || Math.pow(z, 2) == Math.pow(y, 2) + Math.pow(x, 2)) {
            System.out.println("Из введённых отрезков МОЖНО создать прямоугольный треугольник");

        } else {
            System.out.println("Из введённых отрезков НЕЛЬЗЯ создать прямоугольный треугольник");
        }
    }

}
