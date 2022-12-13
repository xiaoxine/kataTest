package com.demo.number;

/**
 * @Author: long
 * @CreateTime: 2022-11-23  17:51
 * @Description: 水仙花数是指一个 n 位数 (n>=3 ) 它的每个位上的数字的 n 次幂之和等于它本身。(思路）cs/
 * 求 100-999 之间所有的水仙花数。
 * @Version: 1.0
 */

/**
 * 求 3 次方的方法:乘三次
 */
public class ShuiXianHua_number {
    public static int scf(int n){
        int m =1;
        for(int i=0;i<=2;i++){              //3.自定义方法，循环 3 次实现 3 次连乘

            m = m*n;

        }
        return m;
    }

    public static void main(String[] args) {
        int i,a,b,c;
        for(i=100;i<=999;i++){              //1.所有的 3 位数循环一遍
            a =i/100;
            b =i/10%10;
            c =i%10;
            if(scf(a)+scf(b)+scf(c)==i){    //2.水仙花条件判断-方法调用-打印输出

                System.out.println("这个数是水仙花数："+i);
            }
        }
    }
}
