package com.demo.number;

import java.util.Map;

/**
 * @Author: long
 * @CreateTime: 2022-11-25  16:15
 * @Description: 这些数是由 1 , 3, 5, 7, 9 这 5 个奇数字排列组成的 5 位素数，
 * 且同时去掉它的最高位与最低位数字后的 3 位数还是素数，
 * 同时去掉它的高二位与低二位数字后的一位数还是素数。
 * 因此，人们把这些神秘的素数称为金蝉素数，喻意金蝉脱壳之后仍为美丽的金蝉。试求出石碑上的金蝉素数。
 * @Version: 1.0
 */
public class JInChanSuShu_number {
    public static void main(String[] args) {

        int k,d=0,t,i,j,a[]=new int[6];
        System.out.println("金蝉素数为:");
        for(k=10001;k<99999;k+=2){
            t=0;                            //素数标志，0 代表是素数，1代表不是素数
            for(j=3;j<= Math.sqrt(k);j+=2){ //试商求素数
                if(k%j == 0){
                    t=1;
                    break;
                }

            }
            if(t==0){
                d=(k/10)%1000;              //取出 k 的中间 3 位数
                for(j=2;j<=Math.sqrt(d);j++){//试商求素数
                    if(d%j == 0){
                        t=1;
                        break;
                    }

                }
            }
            if(t==0){
                a[1]=k%10;                    //存放 k 的个位数
                a[5]=k/10000;                //存放 k 的万位数
                a[2]=d%10;                   //存放 d 的个位数，也是 k 的十位数
                a[3]=(d/10)%10;             //存放 d 的十位数，也是 k 的百位数
                a[4]=d/100;                 //存放 d 的百位数，也是 k 的千位数

                for(i=1;i<=4;i++){
                    for(j=i+1;j<=5;j++){
                        if(a[i] == a[j]){  //比较确保没有相同数字
                            t=1;
                            break;
                        }
                    }
                }
            }
            if(t==0){
                for(j=1;j<=5;j++){
                    if(a[j]%2 ==0 || a[3]==1 || a[3]==9){
                                            //判断是否存在偶数字，中间数字 a[3]是否为 1与 9?
                        t=1;
                        break;
                    }
                }
            }
            if(t==0){
                System.out.printf(" "+"%d",k);

            }
        }
    }
}
