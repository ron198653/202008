package com.java.Day0803;

import java.util.ArrayDeque;

/**
 * @author ron1986
 * @date 2020/8/16 2020/8/16
 * 用方法的重载
 * 求圆形面积和长方形面积啊
 */
public class AreaDemo {
    public double area(double r){
        double s;

        s=Math.PI*r*r;
        return s;
    }
    public double area(double m,double n){
        return m*n;
    }

    public static void main(String[] args) {
        AreaDemo areaDemo =new AreaDemo();
        double r =0;
        double m = 0,n = 0;
        System.out.println("圆形的面积为："+areaDemo.area(4.5));
        System.out.println("长方形的面积为："+areaDemo.area(8,5));
    }
}
