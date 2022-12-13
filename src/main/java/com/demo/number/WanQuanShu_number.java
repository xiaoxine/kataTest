package com.demo.number;

/**
 * @Author: long
 * @CreateTime: 2022-11-27  14:01
 * @Description: 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
 * 编程求 10000 以内的完全数。
 * @Version: 1.0
 */
public class WanQuanShu_number {
    public static void main(String[] args) {
        int sum,j;
        for(int i =2;i<10000;i++){
            sum=0;
            for(j=1;j<=i/2;j++){            //被除数范围
                if(i%j == 0){
                    sum = sum+j;
                }

            }
            if(sum == i){                   //完全数判断
                printwanquanshu(i);
            }

        }
    }
    public static void printwanquanshu(int n){      //输出约数
        int j;
        System.out.print(n+"的约数（自身除外）:");
        for(j =1;j<=n/2;j++){
            if(n%j == 0)
                System.out.print(j +" ");

        }
        System.out.println();
    }
}
