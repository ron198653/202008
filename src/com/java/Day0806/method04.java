package com.java.Day0806;

/**
 * @author ron1986
 * @date 2020/8/20 2020/8/20
 * @desc
 */
public class method04 {
    public static void main(String[] args) {
        //功能相同，但是需要的参数不同；
        //函数的重载（overload）:在同一个类中，允许出现同名函数，但这写函数的参数列表的数据类型必须不同，与形参的名字以及函数的返回值无关
        //参数列表的不同情况：
        //1.参数个数不同
        //2.参数类型不同
        //3.参数顺序不同
    }
    //计算任意个数值的和
    public static int add(int a){
        a++;
        return a;
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,short b){
        return a+b;
    }
}
