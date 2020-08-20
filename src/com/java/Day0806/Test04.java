package com.java.Day0806;

/**
 * @author ron1986
 * @date 2020/8/19 2020/8/19
 * @desc
 */
public class Test04 {
    public static void main(String[] args) {
        for(int x =1;x<=5;x++){
            for(int y =x;y<=5;y++){
                System.out.print(x);
            }
            System.out.println();
        }
        for(int x = 1;x<=5;x++){
            for(int y=1;y<=x;y++){
                System.out.print(x);
            }
            System.out.println();
        }
        for(int x = 1;x<=5;x++){
            for(int y=x;y<=5;y++){
                System.out.print(y);
            }
            System.out.println();
        }
        for(int x = 1;x<=5;x++){
            for(int y=1;y<=x;y++){
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
