package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/14 2020/8/14
 */
public class FacDemo {
    //有参有返回值方法
    //求阶乘的方法
    public int fac(int n){
        int s =1;
        for(int i =1; i<=n;i++){
            s*=i;//s=s*i
        }
        return s;
    }

    public static void main(String[] args) {
        FacDemo facDemo =new FacDemo();
        //3的阶乘
        facDemo.fac(3);
        System.out.println(facDemo.fac(3));
        System.out.println(facDemo.fac(5));
        //求1!+2!+3!+4!+5!
        int sum = 0;
        for(int i =1 ;i<=5;i++){
            int fac=facDemo.fac(i);
            sum=sum+fac;
        }
        System.out.println("1!+2!+3!+4!+5!="+sum);

    }
}
