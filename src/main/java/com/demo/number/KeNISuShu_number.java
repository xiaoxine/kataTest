package com.demo.number;

/**
 * @Author: long
 * @CreateTime: 2022-11-25  16:17
 * @Description: 编写程序找出 1-900 之间的所有可逆素数.
 * （可逆素数是指一个素数的各位数值顺序,颠倒后得到的数仍为素数，如 113、311) 。
 * @Version: 1.0
 */
public class KeNISuShu_number {
    public static void main(String[] args) {
        int count=1;
        System.out.println("1000以内可逆素数如下：");
        for(int i =2;i<1000;i++){
            if(isSuShu(i) && isSuShu(fanXuShu(i))){
                System.out.printf(count++%7!=0?"%3d ":"%3d \n",i);

            }

        }
    }
    /**
     * 是 素 数
     */

    public static boolean isSuShu(int n){
        boolean isSuShu =true;
        if(n ==1 || n ==2){
            return true;
        }
        for(int i=2;i<Math.sqrt(n)+1;i++){
            if(n%i == 0){
                return false;
            }
        }
        if(isSuShu == true){
            return true;
        }else
            return false;
    }

    /**
     * 反素数
     * @param n
     * @return
     */

    public static  int fanXuShu(int n){
        int len = getBitCount(n);
        int s =0;
        for(int i =1;i<len+1;i++){              //循环处理每一位
            s +=Math.pow(10,len-i)*getBit(n,i); //每一位乘以权值累加
        }
        return s;
    }
    /**
     * 获取一个数的位数
     */

    public static int getBitCount(int n){
        int i =1;
        while(n/10>0){
            i++;
            n /=10;
        }
        return i;
    }
    /**
     * 获取 N 位数第 i 位
     */

    public static int getBit(int num,int i){
        if(i >getBitCount(num) || i<1){
            return -1;
        }
        return (num%((int)Math.pow(10,i)))/(int)Math.pow(10,i-1);//拆分取数

    }
}
