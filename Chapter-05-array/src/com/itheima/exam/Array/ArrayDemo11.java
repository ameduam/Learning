package com.itheima.exam.Array;

import java.util.Scanner;

public class ArrayDemo11 {
    //平均分 = (总分-最高-最低)/ 总数-2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入个数");
        int count = sc.nextInt();
        int[] socre = new int[count];


        int max = socre[0];
        int min = socre[0];
        int sum = 0;
        for (int i = 0; i < count; i++){
            socre[i] = sc.nextInt();
            if(max < socre[i]){
                max = socre[i];
            }
            if (min > socre[i]){
                min = socre[i];
            }
            sum += socre[i];
        }

        double averageScore =  1.0 * (sum - max - min) / (count - 2);
        System.out.println("平均分为" + averageScore);
    }
}
