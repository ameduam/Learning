package com.itheima.exam.Array;

import java.util.Scanner;

public class ArrayDemo9 {
    public static void main(String[] args) {
        //输入创建一个指定长度的元素进行键盘录入,将数组中所有大于10并且是4的倍数的元素进行求和及计数,打印结果
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入长度");
        int length = sc.nextInt();
        int[] arr = new int[length];
        int sum = 0;
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + i + "个元素的值");
            arr[i] = sc.nextInt();
            if (arr[i] > 10 && arr[i] % 4 == 0){
                count++;
                sum += arr[i];
            }
        }
        System.out.println("共有" + count + "个数" + "\n" +"和为" + sum);
    }
}
