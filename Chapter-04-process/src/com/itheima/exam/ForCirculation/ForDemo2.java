package com.itheima.exam.ForCirculation;

public class ForDemo2 {
    public static void main(String[] args) {
//        打印所有的水仙花数 计数水仙花数  // 实现自定义范围的个数
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int b = i / 100 % 10;
            int s = i / 10 % 10;
            int g = i / 1 % 10;
            if (b * b * b + s *s * s + g * g * g == i){
                count++;
                System.out.println("数字" + i + "是一个水仙花数");
            }
        }
        System.out.println(count++);
    }
}
