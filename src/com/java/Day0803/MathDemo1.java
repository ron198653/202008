package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/16 2020/8/16
 * 方法重载
 */
public class MathDemo1 {
    public int  plus(int m,int n){
        return m+n;
    }
    public double plus(double m, double n){
        return m+n;
    }
    public int  plus(int[] arr){
        int sum = 0;
        for(int i =0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int m=5,n=10;
        int[] arr={1,2,3,4,5,6};
        MathDemo1 mathDemo1 = new   MathDemo1();
        System.out.println("intl类型的和为;"+mathDemo1.plus(m,n));
        System.out.println("double类型的和为："+mathDemo1.plus(5.6,7.8));
        System.out.println("数组元素和为;"+mathDemo1.plus(arr));


    }
}
