package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/14 2020/8/14
 */
public class Array {
    //有参无返回值，数组作为方法参数
    //打印输出数组元素
    public void printArray(int[] arr){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        Array am = new Array();
        am.printArray(arr);
    }
}
