package com.java.Day0806;

/**
 * @author ron1986
 * @date 2020/8/19 2020/8/19
 * @desc 二维循环
 */
public class Test02 {
    public static void main(String[] args) {
        //打印长方形
        for(int i =0; i<=6;i++){        //外层循环控制行
            for (int n = 0;n<=8;n++){   //内层循环控制列
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
