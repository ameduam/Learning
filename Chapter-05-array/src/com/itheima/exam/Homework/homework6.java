package com.itheima.exam.Homework;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        System.out.print("请输入共有多少个元素");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + i + "个元素");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1){
                System.out.print(" ");
            }
        }
    }
}
