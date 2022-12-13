package com.demo.LuoJi;

import java.util.Scanner;

/**
 * @Author: long
 * @CreateTime: 2022-11-23  20:20
 * @Description: 第一根上面套着 64 个大小不一的圆形金片（圆盘）。
 * 最大的金片在最底下，其余的依次叠上去，且一个比一个小。
 * 勃拉玛要求众僧将该金刚石棒中的金片逐个地移到另一根棒上，规定一次只能移动一个金片，
 * 且金片在放到棒上时，大的只能放在小的下面，但是可以利用中间的一根棒作为辅助移动使用。(思路）递归-有点难度
 * @Version: 1.0
 */
/*
 * 参数 n, 圆盘数量
 * 参数 a 起始地圆盘
 * 参数 b, 辅助圆盘
 * 参数 c, 目的地圆盘
 */
public class HanNouTa {
    static long count;
    public static void main(String[] args) {
        int n;
        count=0;
        System.out.println("汉诺塔问题求解：");
        System.out.println("请输入汉诺塔圆盘的数量：");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();

        hannoi(n,'a','b','c');
        System.out.printf("求解完毕：总共需要%d步移动！\n",count);
    }

    static void hannoi(int n,char a,char b,char c){                         //n个圆盘！！a棒的3个到1个
        if(n == 1){                                                        //递归出口，最终一步也是最重要的
            System.out.printf("第%d次移动：\t1圆盘从%c棒移动到%c棒\n",++count,a,c);

        }else {
            hannoi(n-1,a,c,b);                                          //递归调用，把n-1个圆盘(利用c)从a移动到b
            System.out.printf("第%d次移动：\t2圆盘从%c棒移动到%c棒\n",++count,a,c);
            hannoi(n-1,b,a,c);                                          //递归调用,把n-1个圆盘(利用a)从b移动到c

        }
    }
/*    static void hannoi(int n,char a,char b,char c){
        if(n ==1){
            System.out.printf("第%d次移动：\t圆盘从%c棒移动到%c棒\n",++count,a,c);
        }else{
            hannoi(n-1,a,c,b);
            System.out.printf("第%d次移动：\t圆盘从%c棒移动到%c棒\n",++count,a,c);
            hannoi(n-1,b,a,c);

        }
    }*/
}
