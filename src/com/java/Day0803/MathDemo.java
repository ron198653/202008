package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/14 2020/8/14
 */
public class MathDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int result;//存放结果
        //加法
        result = num1 + num2;
        System.out.println(num1+"+"+num2+"="+result);
        //字符串连接
        System.out.println(""+num1+num2);
        //减法
        result = num1 -num2;
        System.out.println(num1+"-"+num2+"="+result);
        //乘法
        result=num1*num2;
        System.out.println(num1+"*"+num2+"="+result);
        //除法
        result=num1/num2;
        System.out.println(num1+"/"+num2+"="+result);
        //分子分母为整型时，结果为整出后的结果
        System.out.println(13/5);
        System.out.println("13.0/5"+"="+13.0/5);
        //求余数
        result = 13%5;
        System.out.println("13%5"+"="+result);
        System.out.println("13.5%5="+13.5%5);
        int m =10,n=5;
        m=m+3;
        n=n+5;
        double p=(m+n)/2;
        int q = m*m*n*n;
        System.out.println("p的值为："+p+";q的值为："+q);
    }

}
