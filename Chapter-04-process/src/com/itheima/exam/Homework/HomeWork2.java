package com.itheima.exam.Homework;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
//        扫描工龄，工资
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入作为程序员的你的工作的工龄:");
        int WorkingAge = sc.nextInt();
        System.out.print("请输入作为程序员的你的基本工资为:");
        int Salary = sc.nextInt();

//        判断工龄
//                   [10-15)     +20000
//                  [5-10)      +10000
//                 [3~5)       +5000
//                [1~3)       +3000
        if (WorkingAge >= 1 && WorkingAge < 3){
            System.out.println("您目前工作了" + WorkingAge + "年，" + "基本工资为" +Salary + "元, 应涨工资 3000元,涨后工资" + (Salary + 3000) + "元");
        } else if (WorkingAge >= 3 && WorkingAge < 5) {
            System.out.println("您目前工作了" + WorkingAge + "年，" + "基本工资为" +Salary + "元, 应涨工资 5000元,涨后工资" + (Salary + 5000) + "元");
        }else if (WorkingAge >= 5 && WorkingAge < 10) {
            System.out.println("您目前工作了" + WorkingAge + "年，" + "基本工资为" +Salary + "元, 应涨工资 10000元,涨后工资" + (Salary + 10000) + "元");
        }else if (WorkingAge >= 10 && WorkingAge < 15) {
            System.out.println("您目前工作了" + WorkingAge + "年，" + "基本工资为" +Salary + "元, 应涨工资 20000元,涨后工资" + (Salary + 20000) + "元");
        }else {
            System.out.println("您输入的日期可能有问题");
        }


    }
}
