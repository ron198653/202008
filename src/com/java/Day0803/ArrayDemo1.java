package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/16 2020/8/16
 */
public class ArrayDemo1 {
    //定义一个用于修改某个数组元素值的方法
    public void updateArray(int[] a){
        a[3]=15;
        System.out.println("数组a的元素为：");
        for(int n:a){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        ArrayDemo1 AD1 = new ArrayDemo1();
        int[] array={1,2,3,4,5};
        System.out.println("方法调用前的数组元素为;");
        for(int n :array){
            System.out.print(n+" ");
        }
        System.out.println();
        AD1.updateArray(array);
        System.out.println();
        System.out.println("方法调用后的数组array的元素为;");
        for(int n :array) {
            System.out.print(n + " ");
        }
    }
}

