package com.itheima.exam.IfStatementFormats;

public class IfDemo1 {
    public static void main(String[] args) {
        int Limit1 = 100, Limit2 = 200;
        if (Limit1 / 100 % 10 != 3 && Limit2 / 10 % 10 != 5 && Limit1  % 10 != 7 && Limit1 != 100) {
            System.out.println("这个数" + Limit1 + "是满足要求的");
        }
    }
}
