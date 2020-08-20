package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/16 2020/8/16
 */
public class ExchangeDemo {
    public void swap(int a, int b){
        int tmp;
        System.out.println("交换前：a="+a+",b="+b);
        tmp=a;a=b;b=tmp;
        System.out.println("交换后：a="+a+",b="+b);
    }
    public void swapTest(){
        int m=4, n=5 ;//
        System.out.println("交换前：m="+m+",n="+n);
        swap(m,n);//普通方法调用方法直接用方法名调用，
        System.out.println("交换后：m="+m+",n="+n);
    }
    public static void main(String[] args) {
      ExchangeDemo exchangeDemo = new ExchangeDemo();
      exchangeDemo.swapTest();//主方法调用方法必须使用对象名.方法名 //方法尽量封装在方法中，主方法中只体现核心业务逻辑
    }
}
