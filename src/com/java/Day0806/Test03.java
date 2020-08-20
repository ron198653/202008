package com.java.Day0806;

/**
 * @author ron1986
 * @date 2020/8/19 2020/8/19
 * @desc
 */
public class Test03 {
    public static void main(String[] args) {
        //上改条件，下改值
        //######
        //#####
        //####
        //###
        //##
        //#
        for(int i =0;i<6;i++){
            for(int y= i;y<6;y++){
                System.out.print("#");
            }
            System.out.println();
        }
        //#
        //##
        //###
        //####
        //#####
        //######
        for(int x=0;x<=6;x++){
            for(int y=0;y<x;y++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
