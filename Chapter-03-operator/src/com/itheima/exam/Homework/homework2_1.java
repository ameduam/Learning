package com.itheima.exam.Homework;

import java.util.Scanner;

public class homework2_1 {
    public static void main(String[] args) {
//        赋予单价
        int FishPork = 24;
        int Peanut = 8;
        int Rice = 3;

//        扫描份数
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入鱼香肉丝份数");
        int AmountFishPork = sc.nextInt();
        System.out.print("请输入花生份数");
        int AmountPeanut = sc.nextInt();
        System.out.print("请输入米饭份数");
        int AmountRice = sc.nextInt();

//        计算总价
        int Price = (AmountFishPork * FishPork) + (AmountPeanut * Peanut) + (AmountRice * Rice);
//        判断是否打折
        double FinalPrice = Price > 100 ? Price * 0.9 : Price;

//        输出
        System.out.println(FinalPrice);
    }
}
