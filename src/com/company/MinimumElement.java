package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] readElements(int number){
        int[] elements = new int[number];
        Scanner scanner = new Scanner(System.in);
        for (int i =0;i<number;i++){
            elements[i]=scanner.nextInt();
        }
        return elements;
    }

    public static int findMin(int[] array){
        int tmp=array[0];
        for (int i =0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                if(tmp>array[j]) tmp= array[j];
            }
        }
        return tmp;
    }

    private static void reverse(int[] array){
        int[] tmp = new int[array.length];
        System.out.println("Array = "+Arrays.toString(array));
        int tmp2=0;
        for (int i = array.length-1;i>=0;i--){
            tmp[tmp2]=array[i];
            tmp2++;
        }
        array=tmp;
        System.out.println("Reversed array = "+Arrays.toString(array));
    }

}
