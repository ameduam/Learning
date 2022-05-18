package com.itheima.exam.IfStatementFormats;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
//        扫描abc
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入a的值");
        double a = sc.nextDouble();
        System.out.print("请输入b的值");
        double b = sc.nextDouble();
        System.out.print("请输入c的值");
        double c = sc.nextDouble();

//        纯if abc比大小
        if (a > b) {
            if (a > c) {
                System.out.println("a" + a + "为最大值");
            } else {
                System.out.println("c" + c + "为最大值");
            }
        } else {
            if (b > c) {
                System.out.println("b" + b + "为最大值");
            } else {
                System.out.println("c" + c + "为最大值");
            }


//            boolean比大小
            double lager = a > b ? a : b;
            double max = lager > c ? lager : c;
            if (max == a) {
                System.out.println("a" + a + "为最大值");
            } else {
                if (max == b) {
                    System.out.println("b" + b + "为最大值");
                } else {
                    System.out.println("c" + c + "为最大值");
                }
            }

//                考虑值相等值的情况
            if (a == b){
                if (a > c){
                    System.out.println("a和b为最大值");
                } else if (a == c) {
                    System.out.println("abc相等");
                } else if (a < c) {
                    System.out.println("c为最大值");
                }
            } else if (a > b) {
                if (a > c){
                    System.out.println("a为最大值");
                } else if (a == c) {
                    System.out.println("a和c为最大值");
                } else if (a < c) {
                    System.out.println("c为最大值");
                }
            } else if (a < b) {
                if (b > c){
                    System.out.println("b为最大值");
                } else if (b == c) {
                    System.out.println("b和c为最大值");
                } else if (b < c) {
                    System.out.println("c为最大值");
                }
            }
        }
    }
}
