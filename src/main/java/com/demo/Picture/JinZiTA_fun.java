package com.demo.Picture;

import java.util.Scanner;

/**
 * @Author: long
 * @CreateTime: 2022-11-27  14:07
 * @Description: 打印出金字塔图案，如图 1.1 所示。
 * @Version: 1.0
 */
public class JinZiTA_fun {
    public static void main(String[] args) {
        int n,j,k,i;
        Scanner inputu= new Scanner(System.in);
        System.out.println("请输入金字塔层数：");
        n=inputu.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.printf("*");

            }
            System.out.println();
        }
    }
}
