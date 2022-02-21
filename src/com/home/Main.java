package com.home;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input number of array elements");
//        int [] array = new int[scanner.nextInt()];
//        for (int i = 0; i < array.length; i++){
//            array[i] = (int)(Math.random()*100);
//        }
        int array[] = {1, 2, 7, 30, 5, 70, 44};
        arrayPrint(array);
        averageValueInArray(array);
    }

    public static void averageValueInArray(int array[]){
        double averageValue;
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
         averageValue = sum / array.length;
        System.out.println(String.format("%.3f",averageValue));
    }

    public static void arrayPrint(int array[]){
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            if(i > 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
