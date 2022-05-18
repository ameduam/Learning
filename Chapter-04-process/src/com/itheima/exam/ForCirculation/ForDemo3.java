package com.itheima.exam.ForCirculation;

public class ForDemo3 {
    public static void main(String[] args) {
        int line = 6;

        //正直角三角形
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println('\r');

        }
        for (int i = 0; i < 10; i++) {
            System.out.print("+-");
        }
        System.out.println();

        //反直角三角形
        for (int i = 1; i <= line; i++) {
            for (int j = i; j > 1; j--) {
                System.out.print("  ");
            }
            for (int j = 0 ; j <= line - i; j++) {
                System.out.print("x ");
            }
            System.out.println("\r");
        }
    }
}
