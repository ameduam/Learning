package com.itheima.exam.Array;

import java.util.Scanner;

public class ArrayDemo10 {
    public static void main(String[] args) {
        int[] all = {12, 45, 51, 61, 81};
        int max = all[0];
        int min = all[0];

        for (int i = 1; i < all.length; i++) {
            if (all[i] > max) {
                max = all[i];
            }
            if (all[i] < min) {
                min = all[i];
            }

        }
        System.out.println("最大值为" + max);
        System.out.println("最小值为" + min);
    }
}
