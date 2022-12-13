package com.demo.FangCheng;

import java.util.Scanner;

/**
 * @Author: long
 * @CreateTime: 2022-12-02  14:30
 * @Description: 求表达式 s=a+aa+aaa+aa…a 的值，要求 a 从键盘接收，表达式的长度也从键盘接收。
 * @Version: 1.0
 */
public class 求递增总值 {
    public static int getNum(int a ,int length){
        int v=0;
        int s=1;
        for(int i =1;i<length;i++){
            v=v+a*s;
            s=s*10;
        }
        return v;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入a的值：");
        int a = in.nextInt();
        System.out.println("请输入n的值：");
        int n = in.nextInt();
        int sum =0;
        for(int i =1;i<=n;i++){
            sum = sum+getNum(a,i);
        }
        System.out.println("表达式的值" +
                sum);
    }

}
