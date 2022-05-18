package com.itheima.exam.WhileCirculation;

public class WhileDemo {
    public static void main(String[] args) {
//        后i++
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        System.out.println(i);
//        分隔符
        System.out.println("=-=-=-=--=-=");

//        先i++
        i = 1;
        while(i <= 5){
            i++;
            System.out.println(i);

        }

        System.out.println(i);
    }
}
