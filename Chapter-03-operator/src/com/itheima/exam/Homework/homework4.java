package com.itheima.exam.Homework;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
//    扫描三个和尚身高
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个和尚的高度");
        double Monk1 = sc.nextDouble();

        System.out.print("请输入第二个和尚的高度");
        double Monk2 = sc.nextDouble();

        System.out.print("请输入第三个和尚的高度");
        double Monk3 = sc.nextDouble();

        double HigherMonk = Monk1 > Monk2 ? Monk1 : Monk2;
        double HighestMonk = HigherMonk > Monk3 ? HigherMonk : Monk3;

//        输出最高的和尚
        System.out.println(HighestMonk);
    }

}
