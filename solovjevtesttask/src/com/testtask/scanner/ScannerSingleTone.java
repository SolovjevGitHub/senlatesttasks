package com.testtask.scanner;

import java.util.Scanner;

/**
 * Autoparts store project.
 * Author: Solovjev Sergey
 */
public class ScannerSingleTone {

    private static Scanner scanner;

    private static ScannerSingleTone ourInstance = new ScannerSingleTone();

    private ScannerSingleTone() {
    }
    public static ScannerSingleTone getInstance() {
        return ourInstance;
    }


    private void setScanner(){
        scanner=new Scanner(System.in);
    }

    public Scanner getScanner(){
        if(scanner==null){
            setScanner();
        }
        return scanner;
    }

    }


