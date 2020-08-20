package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/14 2020/8/14
 */
public class Rectangle {
    //无参带返回值方法
    public int area(){
        int length =10;
        int width =5;
        int getArea  = length*width;
        return getArea;//返回语句
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int area=rectangle.area();
        System.out.println("长方形的面积为："+area);
//        System.out.println("长方形的面积为："+rectangle.area());

  }
}
