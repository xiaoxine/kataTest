package com.demo.LuoJi;

/**
 * @Author: long
 * @CreateTime: 2022-11-27  14:09
 * @Description: 斐波纳契数列 Fibonacci Sequence ) ，又称黄金分割数列，
 * 指的是这样一个数列：1，1，2, 3, 5, 8, 13, 21, …，这个数列从第三项开始，每一项都等于前两项之和。
 * 求 fibonacci 数列的前 25 项。
 * @Version: 1.0
 */
public class FeiBoNaQie_sequence {
    public static void main(String[] args) {
        int n,m=25;
        int fib[] = new int[m];
        for(n = 1;n<m;n++)
            fib[n] = fibonacci(n);
        System.out.println("斐波那契数列钱25项如下：");
        for(n=1;n<fib.length;n++){
            System.out.print(fib[n]+" ");

        }
        System.out.println();
    }
    public static int fibonacci(int n){
        int f1=1,f2=1,f3=2;
        if(n==1)
            f3=f1;
        if(n==2)
            f3=f2;
        if(n>2){
            for(int i =3;i<=n;i++){
                f3=f2+f1;
                f1=f2;
                f2=f3;
            }

        }
        return f3;

    }
}
