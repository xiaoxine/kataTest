package com.demo.number;

/**
 * @Author: long
 * @CreateTime: 2022-11-23  17:37
 * @Description: 0-9 这 10 个数字可以组成多少不重复的 3 位数?（思路）cs/
 *
 * 穷举法
 * 我们可以从 100 开始，通过循环遍历，一个一个数字进行判断是不是由不重复的 3 个数字组成，如果是，计数器就加1 ,
 * 如果不是，计数器就不加，问题得到解决。
 * @Version: 1.0
 */
public class SanWeiShu_number {
    public static void main(String[] args) {
        int a,b,c;
        int count=0;//计数器
        for(int i=100;i<=999;i++){          //1.确认循环体100-999
            a = i/100;//百位，100/100=0
            b = i/10%10;//求余，100/10 =10 10%10=0
            c = i%10;//个位，100%10=10...1
            if(a!=b && b!=c && a!=c){       //2.条件判断，是否满足，3又要做什么（打印i，计数器，每十个换行）
                System.out.print(i+" ");
                count++;
                if(count%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println("一共有"+count+"个这样的数字。");
    }
/*   public static void main(String[] args) {
       int a,b,c;
       int count=0;
       for(int i =100;i<=999;i++){
           a=i/100;
           b=i/10%10;
           c=i%10;
           if(a!=b && b!=c && a!=c){
               System.out.printf(i+" ");
               count++;
               if(count%10 ==0){
                   System.out.println();
               }

           }
       }
       System.out.printf("不同的三位数一共有"+count);
   }*/
}
