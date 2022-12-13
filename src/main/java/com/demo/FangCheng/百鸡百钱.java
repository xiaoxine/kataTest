package com.demo.FangCheng;

/**
 * @Author: long
 * @CreateTime: 2022-11-29  13:49
 * @Description: 公鸡 5 文钱 1 只，母鸡 3 文钱 1 只，小鸡 3 只 1 文钱，如果用
 * 100 文钱买 100 只鸡，那么公鸡、母鸡和小鸡各应该买多少只呢？
 * @Version: 1.0
 */
public class 百鸡百钱 {
    static void BQBJ(int m,int n){//m 钱买 n 鸡算法
        int x,y,z;
        for(x=0;x<=n;x++){
            for(y=0;y<=n;y++){
                z=n-x-y;
                if(z>0 && z%3 == 0 && x*5+y*3+z/3 ==m){
                    System.out.printf("公鸡：%d只，母鸡：%d只，小鸡：%d只\n",x,y,z);

                }else{
                    ;
                }
            }
        }
    }

    public static void main(String[] args) {
        int m,n;
        m=100;
        n=100;
        System.out.println(m+"钱买"+n+"鸡问题的求解结果为：\n");
        BQBJ(m,n);
    }
}
