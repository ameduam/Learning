package com.itheima.exam.Homework;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
//        扫描abc
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入a的值");
        int a = sc.nextInt();
        System.out.print("请输入b的值");
        int b = sc.nextInt();
        System.out.print("请输入c的值");
        int c = sc.nextInt();


//            比大小
        int lager = a > b ? a : b;
        int max = lager > c ? lager : c;
        if (max == a) {
            System.out.println("a:" + a + "为最大值");
        } else {
            if (max == b) {
                System.out.println("b:" + b + "为最大值");
            } else {
                System.out.println("c:" + c + "为最大值");
            }
        }

    }
}
