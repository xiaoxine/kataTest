package com.demo.LuoJi;

import java.util.Scanner;

/**
 * @Author: long
 * @CreateTime: 2022-11-24  14:52
 * @Description: “回文数”是一种数字。如：98789,这个数字正读是 98789, 倒读也是 98789, 正倒读一样，所以这个数字就是回文数。
 * @Version: 1.0
 */
public class HuiWenShu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数（至少两位数）：");
        int num = in.nextInt();
        int length = getLength(num);
        int reverse = getReverse(num,length);
        if(num == reverse){
            System.out.println(num+"是回文数；");
        }else{
            System.out.println(num+"不是回文数；");
        }
    }

    public static int getLength(int num){
        int count = 0;
        while(num !=0){
            count++;
            num =num/10;
        }
        return count;
    }

    /**
     * 获取反序数
     * @param num 输入的
     * @param length 长度
     * @return
     */
    public static int getReverse(int num,int length){
        int i,tmp,sum=0;
        for(i=1;i<=length;i++){
            tmp=num%10;
            sum=sum+tmp*pow(length-i);  //调用10 的次方方法，求反序数的权重，累加
            num=num/10;
        }
        return sum;


    }

    /**
     * 求10的次方
     * @param n
     * @return
     */
    private static int pow(int n){
        int i;
        int s = 1;
        for(i=0;i<n;i++){           //n 次方，循环 n 次
            s=s*10;
        }
        return s;
    }
}
