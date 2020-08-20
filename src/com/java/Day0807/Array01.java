package com.java.Day0807;

/**
 * @author ron1986
 * @date 2020/8/20 2020/8/20
 * @desc
 */
public class Array01 {
    public static void main(String[] args) {
        //变量:1 2 3 4          目的/作用：存储一个数据
        //数组/array：相同数据类型的多个变量组合
        //作用：存储数据
        //1.数据类型[] 数组名；//推荐使用
        int[] array1 ;
        //2.数据类型 数组名[];
        int array2[];
        //数组的初始化;静态初始化 动态初始化
        //1.静态初始化：开始已经明确了每一个变量
        //1.1格式：数据类型[] 数组名=new 数据类型[] { 如果数组元素有多个，用逗号隔开 }
        array1 =new int[]{66,88,9527,521,22};
        //数组中的每一个变量成为数组元素
        //数组的长度指数组元素的个数，用：数组名.length  来表示
        System.out.println(array1.length);
        System.out.println(array1);//   [:数组        I:int       @ : 分隔符     1b6d3586 : 地址值
        //  new :
        //  1. 凡是使用new关键字声明的数据,都会有唯一的地址值
        //  2. 使用new声明变量会在堆内存中开辟空间
        //  索引值/下标/角标/页码/index : 从0开始,依次递增,比数组的长度小1
        //  数组元素访问 :  数组名[索引值]
        //  数组中的最后一个元素的索引值为  :  数组名.length - 1

        //  数组的遍历/数组的迭代  :  获取数组中的每一个元素
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);
        //System.out.println(array1[5]);//    禁止访问不存在的元素
        System.out.println("---------使用循环对数组进行遍历-------------");
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
            System.out.printf("数组中的第%d个元素的索引值为%d,该元素是%d\n",i+1,i,array1[i]);
        }
        //  1.2  数据类型[] 数组名 = {具体的变量,如果有多个,用逗号隔开} ;
        int[] array3 = {11,22,33,44,55} ;  //  语法糖 : 类型推断 : jvm根据下下文对数据类型做出推断.
        array2 = new int[]{321,22,77} ;
        float[] array4 = {12.11F,3.14F,653.33F} ;
        String[] strings = {"xiaoxiao","xiaohong","xiaobei"} ;
    }

}
