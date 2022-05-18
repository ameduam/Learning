package com.itheima.exam.Array;

import java.util.Scanner;

public class ArrayDemo8 {
    public static void main(String[] args) {
        //输入创建一个指定长度的元素进行键盘录入,将数组中所有大于10并且是4的倍数的元素进行求和及计数,打印结果
        Scanner sc = new Scanner(System.in);
        System.out.print("输入数组长度");
        int length = sc.nextInt();
        int[] intArray = new int[length];


//        遍历数组,赋值
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("请输入第" + i + "索引元素的值");
            intArray[i] = sc.nextInt();
        }

//        求和思想/求和变量 / 计数器思想:计数器变量
        int elementSum = 0;
        int elementCount = 0;

//        遍历数组,获取数组中每一个元素判断,符合计数并且累加
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > 10 && intArray[i] % 4 == 0 ){
                elementSum += intArray[i];
                elementCount++;
            }
        }
        System.out.println("共有"+ elementCount + "个元素符合,和为" + elementSum);


    }
}
