package com.company;

import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size){
        int[] integers= new int[size];
        Scanner scanner = new Scanner(System.in);

        for (int i=0;i<size;i++){
            System.out.println("element "+ i+": ");
            integers[i]=scanner.nextInt();
        }

return integers;
    }

    public static void printArray(int[] integers){
        for (int i =0;i<integers.length;i++){
            System.out.println("Element "+i+" contents "+integers[i]);
        }
    }

    public static int[] sortIntegers(int[] integers){
            int tmp;
        for (int i =0;i<integers.length;i++){
            for (int j=0;j<integers.length-1;j++){
                if (integers[j]<integers[j+1]){
                    tmp=integers[j];
                    integers[j]=integers[j+1];
                    integers[j+1]=tmp;
                }
            }

        }
        return integers;
    }

}
