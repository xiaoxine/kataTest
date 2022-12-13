package com.demo.FangCheng;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: long
 * @CreateTime: 2022-11-29  13:50
 * @Description: 一个共有 10 个台阶的楼梯，从下面走到上面，一次只能迈一个台阶或两个台阶，并
 * 且不能后退，走完这个楼梯共有多少种方法。(问题转换为求 Fibonacci 数列)
 * @Version: 1.0
 */
public class 楼梯台阶 {
    public static void main(String[] args) {
        int f1,f2,f3=0;
        f1=1;
        f2=2;

        String s1="1";
        String s2="11";
        String s3="2";

        List a1 = new ArrayList();
        a1.add(s1);

        List a2 = new ArrayList();
        a2.add(s2);
        a2.add(s3);

        List l1,l2;
        List l =new ArrayList();
        for(int i =3;i<=10;i++){
            f3 = f2+f1;
            f1=f2;
            f2=f3;

            List a3= new ArrayList();

            l1=addPre(a1,2);
            l2=addPre(a2,1);

            a3.addAll(l2);
            a3.addAll(l1);

            a1=a2;
            a2=a3;

            if(i == 10)
                l=a3;

        }
        System.out.println("走法总共有："+f3+"种");
        System.out.println("走法如下：");
        print(l);

    }
    public static void print(List list){
        for(int i = 0;i<list.size();i++){
            String title = (String) list.get(i);
            System.out.println("第"+(i+1)+"种走法"+title);
        }
    }
    public static ArrayList addPre(List list,int num){
        ArrayList a1=new ArrayList();
        for(int i =0;i<list.size();i++){
            String title =(String) list.get(i);
            title=num+title;
            a1.add(title);
        }
        return a1;
    }
}
