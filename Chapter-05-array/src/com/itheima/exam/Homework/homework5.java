package com.itheima.exam.Homework;

public class homework5 {
    public static void main(String[] args) {
        int arr[] = new int[]{100,50,90,60,80,70};
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
            sum += arr[i];
        }
        int averagenum = (sum - min - max) / 4;
        System.out.println(averagenum);
    }
}
