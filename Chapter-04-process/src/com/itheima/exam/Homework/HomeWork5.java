package com.itheima.exam.Homework;

public class HomeWork5 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1000;i <= 9999;i++){
            if((i % 10) + (i / 1000 % 10) == (i / 100 % 10 ) + (i / 10 % 10)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
