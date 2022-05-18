package com.itheima.exam.Homework;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {


//        扫描数字
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字");

//   输出1.数字的个位数不为7;
//		2.数字的十位数不为5;
//		3.数字的百位数不为3;
//    输出:满足如下要求的数字,
//        数字的个数,
//        以及数字的和
        int Count = 0;
        int Limit = sc.nextInt();
        int sum = 0;
        for (;Limit < 1000 && Limit >=100;Limit--){
            if (Limit / 100 % 10 != 3 && Limit / 10 % 10 != 5 && Limit  % 10 != 7 && Limit != 100){
                System.out.println("这个数" + Limit + "是满足要求的");
                sum += Limit;
                Count++;
            }

        }
        System.out.println("共有" + Count + "个数" + "\n" + "总和为" + sum);
    }
}