package com.itheima.exam.ForCirculation;

import java.util.Scanner;

public class ForDemo1 {
    public static void main(String[] args) {
//        int Limpt1;
//        int Limpt2;

//        指定范围内能被指定模数相除余之和

//        扫描指定范围的两个被模数，模数
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个范围");
        int Limpt1 = (int)sc.nextDouble();
        System.out.print("请输入另一个范围");
        int Limpt2 = (int)sc.nextDouble();
        System.out.print("请输入模数");
        int mod = (int)sc.nextDouble();

//        判断上下限
        int sum = 0;
        if (Limpt1 > Limpt2){
            for (; Limpt1 >= Limpt2 ; Limpt1--){
                if (Limpt1 % mod == 0){
                    sum = sum + Limpt1;
                }
            }
            System.out.println(sum);
        }else {
            for (; Limpt2 >= Limpt1; Limpt2--) {
                if (Limpt2 % mod == 0) {
                    sum = sum + Limpt2;
                }
            }
            System.out.println(sum);
        }
    }
}
