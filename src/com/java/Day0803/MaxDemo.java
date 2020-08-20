package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/14 2020/8/14
 */
public class MaxDemo {
    //有参无返回值方法
    //方法重载，方法名相同，参数不同
    public void max (double a,double b){

    }
    public void max(float a,float b){
        float max;
        if(a>b){
            max=a;
        }else {
            max = b;
        }
        System.out.println(a+"和"+b+"的最大值为："+max);
    }

    public static void main(String[] args) {
        MaxDemo maxDemo = new MaxDemo();
        maxDemo.max(5,3);
        maxDemo.max(12.0f,13.5f);
        maxDemo.max(1.2,2.4);
    }
}
