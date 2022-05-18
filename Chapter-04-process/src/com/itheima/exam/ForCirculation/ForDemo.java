package com.itheima.exam.ForCirculation;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 1; i <= 4; i++){
            System.out.println("HelloWorld");
        }
        System.out.println(i);
        for (i = 0; i < 5 ; i++){
            System.out.println(i);
        }
        for (i = 127; i < 137; i++){
            System.out.println(i);
        }
        for (int j = 0; j < 2; ) {
            System.out.println(j);
            j++;
            System.out.println(j);
        }
    }
}
