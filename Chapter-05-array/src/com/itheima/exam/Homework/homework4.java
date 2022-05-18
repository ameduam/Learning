package com.itheima.exam.Homework;

public class homework4 {
    public static void main(String[] args) {
        int arr[] = new int[]{100,50,90,60,80,70};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
