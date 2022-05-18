package com.itheima.exam.WhileCirculation;

public class WhileDemo1 {
    public static void main(String[] args) {
        double Thinknees = 0.5;
        int Mountain = 8844430;
        int Count = 1;

        int  Count1 = 1;

        while(Thinknees < Mountain){
            Thinknees *= 2;
            Count++;
        }
        System.out.println(Count);


        for(Count = 1 , Thinknees = 0.5; Thinknees < Mountain ; Thinknees *= 2){
           Count++;
        }
            System.out.println(Count);

        for(Count1 = 1, Thinknees = 0.5; Thinknees < Mountain ; Thinknees *= 2){
            Count1++;
        }
        System.out.println(Count1);
        System.out.println(Thinknees);

    }
}
