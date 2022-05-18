package com.itheima.exam.Homework;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
//        扫描父母身高
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入父亲身高:");
        double Father = sc.nextDouble();
        System.out.print("请输入母亲身高:");
        double Mother = sc.nextDouble();

//        儿女身高

        double Son = (Father + Mother) * 1.08 / 2;
        double Daughter = (Father * 0.923 + Mother) / 2;

//        输出儿女身高
        System.out.println(Son);
        System.out.println(Daughter);
    }
}
