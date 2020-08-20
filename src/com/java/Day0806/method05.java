package com.java.Day0806;

/**
 * @author ron1986
 * @date 2020/8/20 2020/8/20
 * @desc
 */
public class method05 {
    public static void main(String[] args) {
        //运算符按操作变量的个数划分为以下几个类型
        //一元运算符：++ -- - +
        //二元运算符：==   !=
        //三元运算符：boolean类型表达式？ 表达式1:表达式2
        //          其实就是if...else的简写
        //获取两个数值中的较大值
        int i = 100, j = 15;
        int max = i>j? i:j;
        System.out.println("max="+max);
    }
}
