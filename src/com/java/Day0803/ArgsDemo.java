package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/16 2020/8/16
 */
public class ArgsDemo {
    //求和的方法
    public void sum(int... n){
        int sum =0;
        for(int i:n){  //每次都从可变参数列表中取一个元素赋值给i
            sum = sum +i;
        }
        System.out.println("sum="+sum);
    }
    public static void main(String[] args) {
       ArgsDemo ad = new ArgsDemo();
       ad.sum(1);
       ad.sum(1,2,3,4);
    }
}
