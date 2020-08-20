package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/16 2020/8/16
 */
public class ArgsDemo1 {
    //查找,参数列表中有两个以上的参数，可变参数一定在最后，和数组兼容，不能方法重载
    public void search(int n,int... a){
        boolean flag =false;//默认找不到
        for(int a1:a){
            if(a1==n){
                flag=true;break;
            }
        }
        if(flag){
            System.out.println("找到了"+n);
        }else {
            System.out.println("没找到"+n);
        }
    }
    public static void main(String[] args) {
       ArgsDemo1 as = new ArgsDemo1();
       as.search(3,1,2,3,4);
       int[] a={1,2,3,4,5};
       //数组和可变参数列表是可以兼容的，数组可以给可变参数列表传值，可变参数列表不能给数组传值
       as.search(2,a);
    }
}
