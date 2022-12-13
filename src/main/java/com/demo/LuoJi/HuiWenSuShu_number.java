package com.demo.LuoJi;

/**
 * @Author: long
 * @CreateTime: 2022-11-27  13:31
 * @Description: 所谓回文素数是指，对一个整数 n 从左向右和从右向左读结果值相同且是素数，即称为回文素数。
 * 求不超过 1000 的回文素数。
 * @Version: 1.0
 */
public class HuiWenSuShu_number {

    public static void main(String[] args) {
        for(int i =2;i<=1000;i++){
            if(isPrime(i) ==1 && isHuiWen(i) ==1){
                System.out.printf("%d ",i);
            }
        }
    }

    /**
     * 判断素数
     * @param num
     * @return
     */
    public static int isPrime(int num){
        for(int i =2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                return 0;
            }
        }
        return 1;
    }

    /**
     * 判断回文数
     * @param num
     * @return
     */
    public static int isHuiWen(int num){
        String str =trans(num);
        int ls = str.length();
        for(int i =0;i<ls;i++){
            if(str.codePointAt(i) != str.codePointAt(ls-1-i)){  //首尾对称比较
                return 0;
            }


        }
        return 1;

    }

    /**
     * 转换字符串
     * @param n
     * @return
     */
    static String trans(int n){
        int a = n;
        String res ="";         //初始化
        while(a!=0){
            int b =a%10;
            res = b+res;
            a=a/10;
        }
        return res;
    }
}
