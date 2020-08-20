package com.java.Day0803;

import java.util.Scanner;

/**
 * @author ron1986
 * @date 2020/8/16 2020/8/16
 */
public class Array2 {
    //数组作为方法参数，带参带返回值方法
    //查找数组元素的值
    public boolean search(int n,int[] arr){
        boolean flag=false;//默认没找到
        for(int i = 0;i<arr.length;i++){
            if (arr[i]==n){
                flag=true;//找到了
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50,60};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数据：");
        int n1=sc.nextInt();
        Array2 as = new Array2();
        boolean flag = as.search(n1,arr1);//接受方法的返回值
        if(flag){
            System.out.println("找到了");
        }else {
            System.out.println("没找到");
        }
    }
}
