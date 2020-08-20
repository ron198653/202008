package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/17 2020/8/17
 */
public class ArgsDemo2 {
    //可变参数列表所在的方法是最后被访问的
    public int plus(int a,int b){
        System.out.println("不带可变参数的方法被调用");
        return a+b;
     }
    public int plus(int... a){
        int sum =0;
        for(int n:a){
            sum=sum+n;
        }
        System.out.println("带可变参数的方法被调用");
        return sum;
    }

    public static void main(String[] args) {
        ArgsDemo2 ad =new ArgsDemo2();
        System.out.println("和为"+ad.plus(3,4));
        System.out.println("和为："+ad.plus(1,2,3));
    }
}
