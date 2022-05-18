package com.itheima.exam.operator;

import java.util.Scanner;

public class OperatorDemo6 {
    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        System.out.println("请输出第一个数");
        double num1 = st.nextDouble();
        boolean result1 = num1 % 3 == 0 && num1 < 50;
        System.out.println(result1);

        System.out.print("请输出第二个数");
        double num2 = st.nextDouble();
        boolean result2 = num2 % 3 == 0 && num2 > 20;
        System.out.println(result2);

        System.out.println("请输出第三个数");
        double num3 = st.nextDouble();
        boolean result3 = num3 % 4 == 0 || num3 < 30;
        System.out.println(result3);



    }
}
