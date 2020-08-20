package com.java.Day0806;

/**
 * @author ron1986
 * @date 2020/8/19 2020/8/19
 * @desc
 */
public class method02 {
    public static void main(String[] args) {
        //调用下面所需要的函数
        m1();
        System.out.println("-----------m2----------");
        m2("xiaoxiao",29);
        System.out.println("-----------getName----------");
        String name = getName();
        System.out.println("name="+name);
        System.out.println("-----------getSum----------");
        short a=3000 , b=321;
        int sum=getSum(a,b);
        System.out.println("sum="+sum);
        System.out.println("over");
    }
    //无参无返回值
    public static void m1(){
        System.out.println("无参无返回值");
    }
    //有参无返回值
    // 斜杠两颗星是文档注释,对代码的解释说明,相当于产品的说明书
        /**
         *功能：函数功能描述
         * @param name 用户名字
         * @param age  用户年龄
         */
    public static void m2(String name, int age){
        System.out.println("有参无返回值");
        System.out.println("name ="+name);
        System.out.println("age ="+age);
    }
    //无参有返回值
    //获取用户名：字符串String
    public static  String getName(){
        System.out.println("有返回值，无参数");
        System.out.println("return1.结束函数 2.将函数的结果值返回给调用者");
        return "xiaoxiao";
    }
    //有参有返回值
    //计算两个short数的加法
    public static int getSum(short s1,short s2){
        System.out.println("有参有返回值");
        return s1+s2;
    }


}
