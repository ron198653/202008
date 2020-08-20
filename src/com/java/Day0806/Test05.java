package com.java.Day0806;

/**
 * @author ron1986
 * @date 2020/8/19 2020/8/19
 * @desc 乘法口诀表
 */
public class Test05 {
    public static void main(String[] args) {
        for(int x = 1;x<=9;x++){
            for(int y = 1;y<=x;y++){
                System.out.print(y+"*"+x+"="+x*y+"  ");
            }
            System.out.println();
        }
    }
}
