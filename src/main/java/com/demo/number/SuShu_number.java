package com.demo.number;

/**
 *@Author: long
 *@CreateTime: 2022-10-22  22:21
 *@Description: 素数（质数）指的是不能被分解的数，除了 1和它本身之外就没有其他数能够整除。(不能被整除的数，范围：1-素数之间，布尔类型不够熟练）
 * 求 100 以内的所有素数。
 *@Version: 1.0
 */
public class SuShu_number {
/*
    ( 1 ) 确定程序框架
    通过前面的分析，从 2 100—个一个判断是不是素数。程序框架如下：
    (2) 素数判断
    由前面的问题分析可知，我们可以从 2 开始，到该整数 n 的开平方根为止，用 n 依次
    去除这些数，只要有一个数能被整除，即可判断该数不是素数，否则是素数。
    (3) 完整程序
    现在我们就需要把刚才的程序进行组合，构成我们的完整程序:
*/
/*    public static void main(String[] args) {
        //为什么要创建对象
        SuShu_number test = new SuShu_number();
        System.out.println("100以内的素数如下：");
        int count =0;
        for(int i =2;i<100;i++){
            if(test.isPrimeNumber(i) == true){
                System.out.print(i+" ");
                //计数器
                count++;
                if(count%10 == 0){
                    System.out.println();
                }
            }
        }
    }

    public boolean isPrimeNumber(int number){
        //标识
        boolean flag =true;
        if(number<0){
            throw new IllegalArgumentException("number是不合法的参数");

        }
        for(int i =2;i<= Math.sqrt(number);i++){
            //System.out.print(Math.sqrt(number));
            if(number%i ==0){ //如果有一个数被整除，说明不是素数
                flag = false;
                break;
            }
        }
        return flag;
    }*/

    public static void main(String[] args) {
        SuShu_number suShu_number = new SuShu_number();
        System.out.println("100以内素数如下:");
        int count=0;
        for(int i =2;i<=100;i++){                       //1.循环2-100判断每个数是不是素数
            if(suShu_number.isPrimeNumber(i)==true){    //2.调用自定义判断方法
                System.out.printf(i+" ");
                count++;
                if(count%10 ==0){
                    System.out.println();
                }
            }
        }
    }
    public static boolean isPrimeNumber(int i){
        boolean flag =true;                              //3.1素数标志
        for(int j=2;j<= Math.sqrt(i);j++){               //3.2用这个数循环除以 2、3……一直到这个数的平方根数
            if(i%j ==0){                                 //3.3如果有一个数被整除，说明不是素数
                flag =false;
                break;                                   //如果不是素数则退出
            }

        }
        return flag;
    }

/*
    public static void main(String[] args) {
        SuShu_number suShu_number = new SuShu_number();
        int count =0;
        System.out.println("100以内素数如下:");
        for(int j =2;j<=100;j++){
            if(suShu_number.isPrimeNumber(j) == true){
                System.out.printf(j+" ");
                count++;
                if(count%10 ==0){
                    System.out.println();
                }
            }
        }
    }


    public static boolean isPrimeNumber(int i){
        boolean flag =true;
        for(int j =2;j<= Math.sqrt(i);j++){
            if(i%j == 0){
                flag=false;
                break;
            }
        }

        return flag;
    }
*/



}
