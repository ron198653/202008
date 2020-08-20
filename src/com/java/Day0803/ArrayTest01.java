package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/14 2020/8/14
 */
public class ArrayTest01 {
    //数组作为参数的方法，有参无返回值
    public void ave(float[] arr){
        float sum=0;
        float ave = 0;
        for(int i =0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        ave=sum/arr.length;
        System.out.println("数组元素的平均值为："+ave);
    }

    public static void main(String[] args) {
        ArrayTest01 arrayTest01 = new ArrayTest01();
        float[] arr={78.5f,98.5f,65.5f,32.5f,75.5f};
        arrayTest01.ave(arr);
    }
}
