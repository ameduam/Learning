package com.itheima.exam.Homework;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
//        扫描老虎体重
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一只老虎的重量");
        double Tiger1 = sc.nextDouble();
        System.out.print("请输入第二只老虎的重量");
        double Tiger2 = sc.nextDouble();

//        比较老虎体重
        boolean Result = Tiger1 == Tiger2;

        System.out.println("两只老虎重量相等的结果为" + Result);
        }

    }
