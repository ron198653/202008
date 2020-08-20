package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/16 2020/8/16
 */
public class ExchangeDemo1 {
    public void add(int n){
        n++;
        System.out.println("方法中n="+n);
    }
    public void add1(){
        int n =10 ;
        System.out.println("方法调用前：n="+n);
        add(n);
        System.out.println("方法调用后：n="+n);
    }

    public static void main(String[] args) {
        ExchangeDemo1 ed1 = new ExchangeDemo1();
        ed1.add1();//add方法封装在add1中直接调用，减少主方法中的代码量

    }
}
