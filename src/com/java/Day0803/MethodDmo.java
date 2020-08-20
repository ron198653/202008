package com.java.Day0803;

/**
 * @author ron1986
 * @date 2020/8/14 2020/8/14
 */
public class MethodDmo {
    //无参无返回值方法
    //打印输出星号的方法
    public void printStar(){
        System.out.println("********************************************");
    }
    public static void main(String[] args) {
        //创建一个MethodDemo类的对象myMethodDemo;
        MethodDmo myMethodDemo = new MethodDmo();
        //使用对象名.方法名()去调用方法
        myMethodDemo.printStar();
        System.out.println("欢迎来到JAVA世界");
        myMethodDemo.printStar();
    }

}
