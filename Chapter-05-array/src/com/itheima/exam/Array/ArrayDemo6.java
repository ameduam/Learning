package com.itheima.exam.Array;

import java.util.Scanner;

public class ArrayDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int length = 5;
        int[] intArray = new int[5/*length*/];
        int length = intArray.length;

        for (int i = 0; i < intArray.length ; i++) {
            int element = sc.nextInt();
            intArray[i] = element;
            System.out.println("此时数组中" + "第" + (i+1) +"个元素值为" + intArray[i]);
        }

        int[] intArray1 = new int[5/*length*/];
        int length1 = intArray1.length;
        for (int i = 0; i < intArray1.length ; i++) {
//            int element = sc.nextInt();
//            intArray1[i] = element;
            intArray1[i] = sc.nextInt();
            System.out.println("此时数组中" + "第" + (i+1) +"个元素值为" + intArray1[i]);
        }



    }
}
