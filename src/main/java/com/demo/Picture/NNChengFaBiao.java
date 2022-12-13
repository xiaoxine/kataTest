package com.demo.Picture;

/**
 * @Author: long
 * @CreateTime: 2022-11-23  20:16
 * @Description: 输出九九乘法口诀表(思路）
 * @Version: 1.0
 */
public class NNChengFaBiao {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){                          //1.外循环控制行数
            for(int j=1;j<=i;j++){                      //2.内循环控制 每行表达式个数==外循环控制行数
                System.out.printf(j+"*"+i+"="+i*j+" "); //3.打印表达式
            }
            System.out.println();                       //一行结束换行
        }
    }

/*    public static void main(String[] args) {
        for(int i =1;i<=9;i++){
            for(int j =1;j<=i;j++){
                System.out.printf(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }

    }*/
}
