package com.demo.number;
/**
 * @Author: long
 * @CreateTime: 2022-11-23  20:14
 * @Description: 若两个素数之差为 2, 则这两个素数就是孪生素数。
 * 编写程序找出 1-100 之间的所有孪生素数。
 * @Version: 1.0
 */
public class LuanShengSuShu {
    public static boolean isPrimeNumber(int number){        //1.找出素数
        boolean flag =true;
        for(int i =2;i<= Math.sqrt(number);i++){
            if(number%i ==0){
                flag =false;                              //素数标志，还可以赋值为 0,1 表示不是素数
                break;
            }

        }
        return flag;
    }

    public static void main(String[] args) {
        LuanShengSuShu luanShengSuShu = new LuanShengSuShu();
        int a[] = new int[100];
        int n=0;
        for(int i=1;i<=100;i++){
            if(luanShengSuShu.isPrimeNumber(i) ==true){
                a[n] = i;                               //2.将素数存入数组
                n++;
            }

        }
        System.out.println("100以内的孪生素数如下：");
        for(int j=0;j<n-1;j++){                          //遍历数组 j<n-1
            if(a[j+1]-a[j] ==2){                        //3.判断相邻两个数的差是否为 2, 如果是，打印结果
                System.out.printf(a[j]+" ");
                System.out.printf(a[j+1]+" ");
                System.out.println();
            }
        }
    }

    /*public static void main(String[] args) {
        LuanShengSuShu luanShengSuShu = new LuanShengSuShu();
        int a[] = new int[100];
        int n=0;
        for(int i=1;i<=100;i++){
            if(luanShengSuShu.isPrimeNumber(i) == true){
                a[n]=i;
                n++;
            }

        }
        System.out.println("100以内的孪生素数如下：");
        for(int j=0;j<n-1;j++){
            if(a[j+1]-a[j] ==2){
                System.out.printf(a[j]+" ");
                System.out.printf(a[j+1]+" ");
                System.out.println();
            }
        }

    }*/

}

