package com.itheima.exam.Homework;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
//        单价赋值扫描份数得出总价
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入鱼香肉丝份数");
        int Amount = sc.nextInt();
        int FishPork = 24;
        double Price = Amount * FishPork;

        System.out.print("请输入花生米份数");
        Amount = sc.nextInt();
        int Peanut = 8;
        Price = Price + (Amount * Peanut);

        System.out.print("请输入米饭份数");
        Amount = sc.nextInt();
        int Rice = 3;
        Price = Price + (Amount * Rice);

//    判断是否打折
        Price = Price > 100 ? Price * 0.9 : Price;
        System.out.println(Price);


    }
}
