package com.itheima.exam.Homework;

public class homework3 {
    public static void main(String[] args) {
        int arr[] = new int[]{100,50,90,60,80,70};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
