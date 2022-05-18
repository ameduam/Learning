package com.itheima.exam.Homework;

import java.util.Scanner;

public class HomeWork4_Advancde {
    public static void main(String[] args) {


//        扫描数字
        Scanner sc = new Scanner(System.in);


//   输出1.数字的个位数不为7;
//		2.数字的十位数不为5;
//		3.数字的百位数不为3;
//    输出:满足如下要求的数字,
//        数字的个数,
//        以及数字的和
//        目前只能算大于如果是大于等于可能需要dowhile

//        还可以优化成不需要'上下'极限,只输入数字
        int Count = 0;
        System.out.print("请输入一个极限");
        int Limit1 = sc.nextInt();
        System.out.print("再次输入另一个极限");
        int Limit2 = sc.nextInt();//不加一后面就不会循环Limit1==Limit2了

        if (Limit1 > Limit2){
            Limit1 = Limit1 + Limit2;
            Limit2 = Limit1 - Limit2;
            Limit1 = Limit1 - Limit2;
        }
        System.out.println(Limit1 + "和" + Limit2);
        Limit2++;

        int sum = 0;
        for (;Limit1 != Limit2;){
            //System.out.println(Limit1);
            if (Limit1 / 100 % 10 != 3 && Limit1 / 10 % 10 != 5 && Limit1  % 10 != 7){
                System.out.println("这个数" + Limit1 + "是满足要求的");
                sum += Limit1;
                Count++;
            }
            if (Limit1 >= Limit2){
                Limit1--;
            }else if (Limit2 >= Limit1){
                Limit1++;
            }
        }
        System.out.println("共有" + Count + "个数" + "\n" + "总和为" + sum);
    }
}