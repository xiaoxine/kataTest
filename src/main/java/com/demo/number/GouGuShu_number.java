package com.demo.number;

/**
 * @Author: long
 * @CreateTime: 2022-11-27  14:05
 * @Description: 所谓勾股数，一般是指能够构成直角三角形 3 条边的 3 个正整数(a b c)
 * 求 1000 以内的勾股数。
 * @Version: 1.0
 */
public class GouGuShu_number {
    public static void main(String[] args) {
        getGouGuNum2(10000);
    }
    public static final void getGouGuNum(int num){ //采用循环嵌套的方式实现穷举
        for(int i =1;i<=num;i++){
            for(int j =1+i;j<=num;j++){
                for(int k=1+j;k<=num;k++){
                    if(i*i+j*j == (k*k)){
                        System.out.println(" "+i+" "+j+" "+k);
                    }
                }
            }
        }
    }
    public static final void getGouGuNum2(int num){     //双重循环，比上一个方法减少一层循环

        for(int i =1;i<=num;i++){
            for(int j =1+i;j<=num;j++){
                int sum =i*i+j*j;
                int k=(int)(Math.sqrt(sum));
                if(k*k==sum && k<=num){
                    System.out.println(" "+i+" "+j+" "+k);
                }
            }
        }
    }
}
