package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/14 2020/8/14
 */
public class DisCountDemo {
    //有参无返回值方法
    public void DisCount(double p){
        double price;
        if(p<100){
            price=p;
        }else if(p<=199){
            price=0.95*p;
        }else{
            price=0.85*p;
        }
        System.out.println("折后商品总价为："+price);
    }

    public static void main(String[] args) {
        DisCountDemo disCountDemo =new DisCountDemo();
        disCountDemo.DisCount(150);
    }
}
