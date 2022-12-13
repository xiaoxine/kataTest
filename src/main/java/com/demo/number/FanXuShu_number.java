package com.demo.number;

/**
 * @Author: long
 * @CreateTime: 2022-11-23  18:08
 * @Description: 一个 3 位数各位上的数字都不相同，它和它的反序数的乘积是 280021, 这个 3 位是应是多少?找出（思路）
 * @Version: 1.0
 */
public class FanXuShu_number {
    public static void fanXu(int n){
        int a,b,c;
        a=n/100;
        b=n/10%10;
        c=n%10;
        int fx =c*100+b*10+a;
        if(fx*n ==280021){                 //2.自定义fanXu()方法，判断条件满足它和它的反序数的乘积是 280021
            System.out.println(a+""+b+""+c);
        }
    }

    public static void main(String[] args) {
        System.out.println("要找到数如下：");
        for(int i = 100;i<=999;i++){        //1.指定范围数
            fanXu(i);                       //3.调用反序方法（）
        }
    }

/*    public static void fanxu(int i){
        int fx,a,b,c;
        a=i/100;
        b=i/10%10;
        c=i%10;
        fx=c*100+b*10+a;
        if(fx*i == 280021){
            System.out.println("这个三位数是"+i);
        }

    }

    public static void main(String[] args) {
        for(int i =100;i<=999;i++){
            fanxu(i);
        }
    }*/
}
