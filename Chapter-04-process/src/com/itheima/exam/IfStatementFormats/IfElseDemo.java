package com.itheima.exam.IfStatementFormats;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
//        扫描星期几
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个星期数");
        int week = (int)sc.nextDouble();

        if (week == 1){
            System.out.println("今天吃1");
        } else if (week == 2) {
            System.out.println("今天吃2");
        } else if (week == 3) {
            System.out.println("今天吃3");
        } else if (week == 4) {
            System.out.println("今天吃4");
        } else if (week == 5) {
            System.out.println("今天吃5");
        } else if (week == 6) {
            System.out.println("今天吃6");
        } else if (week == 7) {
            System.out.println("今天吃7");
        } else // if (week > 7 || week < 1)可有可无,只是为了理解
        {
            System.out.println("什么成分?");
        }
    }
}
