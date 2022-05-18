package com.itheima.exam.Array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int num = 1;
        double[] arr = new double[]{1.0, 2.0, 3.0, num};
        System.out.println(arr[3]);

        char c = 'a';
        int[] arr1 = new int[]{1,2,'a',c};
        System.out.println(arr1[3] + "+" + arr1[2]);

    }
}