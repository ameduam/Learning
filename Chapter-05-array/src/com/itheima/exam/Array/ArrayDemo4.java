package com.itheima.exam.Array;

public class ArrayDemo4 {
    public static void main(String[] args) {
//        int x = 97;
//        char[] arr = {'我', x, 97};
//        System.out.println(arr[2]);

        char arr2 = 'a';
        char[] arr3 = {'a', arr2};

        int[] arr4 =new int[3];
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);

        arr4[0] = 100;
        arr4[1] = 200;
        arr4[2] = 300;
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);
    }
}
