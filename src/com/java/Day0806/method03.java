package com.java.Day0806;

/**
 * @author ron1986
 * @date 2020/8/20 2020/8/20
 * @desc
 */
public class method03 {
    public static void main(String[] args) {
        //怎样定义函数？
        //两步：
        //1.确定形参，确定运算过程中需要的未知元素
        //2.确定返回值类型：功能完成后的最终结果
        System.out.println(compareIntToInt(1230,12300));
        System.out.println("--------------------------------------------");
        System.out.println(compareIntToInt1(1230,12300));
        System.out.println("--------------------------------------------");
        System.out.println(compareIntToInt2(1230,12300));
    }
    //比较两个int型数值的大小  见名知意
    /*
       1.形参：int int
       2.返回值:String
     */
    public static String compareIntToInt(int a,int b){
        if (a>b){
            return a+">"+b;
        }else if(a==b){
            return a+"="+b;
        }else{
            return a+"<"+b;
        }
    }
    public static String compareIntToInt1(int a,int b){
        if(a>b){
            return a+">"+b;
        }
        if(a==b){
            return a+"="+b;
        }
        return a+"<"+b;
    }
    public static String compareIntToInt2(int a, int b){
        return a>b ? (a+">"+b):(a==b? a+"="+b:a+"<"+b);
    }
}
