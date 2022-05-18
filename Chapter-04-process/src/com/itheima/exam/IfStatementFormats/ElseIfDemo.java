package com.itheima.exam.IfStatementFormats;

import java.util.Scanner;

public class ElseIfDemo {
    public static void main(String[] args) {
//        扫描分数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩");
        int score = (int)sc.nextDouble();

//        根据分数判断奖励
        if (100 >= score && score >= 95){
            System.out.println("100-95");
        } else if (94 >= score && score >= 90) {
            System.out.println("94-90");
        } else if (89 >= score && score >= 80) {
            System.out.println("80-89");
        } else if (79 >= score && score >= 0) {
            System.out.println("0-79");
        } else if (100 < score && score < 0) {
            System.out.println("不合法");
        }
    }
}
