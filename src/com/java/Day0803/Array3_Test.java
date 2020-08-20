package com.java.Day0803;

import java.util.Scanner;

/**
 * @author ron1986
 * @date 2020/8/17 2020/8/17
 * 简单的数组管理系统
 */
public class Array3_Test {
        //插入数据
        public int[] insertData(){
            int[] array= new int[10];//定义一个长度为10的数组
            Scanner sc =new Scanner(System.in);// 创建一个Scanner类的对象
            for(int i=0;i<array.length-1;i++){
                System.out.println("请输入第"+(i+1)+"个数:");
                array[i]=sc.nextInt();
            }
            System.out.println("数组元素为:");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + "  ");
            }
            System.out.println();
            return array;// 返回数组
        }
        //显示所有数据
        public void showData(int[] array,int length){
            System.out.println("数组的元素为:");
            for(int i =0;i<length;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
        //指定位置插入数据
        public void insertAtArray(int[] array,int data,int k){//data为插入的数据，k为插入的位置
            // 将指定位置后的元素依次交换
            for(int i=array.length-1;i>k;i--){
                array[i]=array[i-1]; //如过有新元素，在索引之后的元素后移一位
            }
            array[k]=data;//将指定元素插入指定位置
        }
        //查询能被3整除的数据
        public void divThreee(int[] array){
            System.out.println("能被三整除的元素有：");
            for(int i:array){
                if(i%3==0){
                    System.out.print(i);
                }
            }
        }
    //显示数据信息
    public void notice() {
        System.out.println("**************************");
        System.out.println("1--插入数据");
        System.out.println("2--显示所有数据");
        System.out.println("3--在指定位置插入数据");
        System.out.println("4--查询能别三整除的数据");
        System.out.println("0--退出系统");
        System.out.println("**************************");
        System.out.println("请输入对应的数字进行操作");
    }
    //主方法
    public static void main(String[] args) {
        Array3_Test demo=new Array3_Test();
        Scanner sc =new Scanner(System.in);
        int[] array = new int[10];
        boolean outCome=true;
        while (outCome){
            demo.notice();
            int c=sc.nextInt();
            switch (c){
                case 1://插入数据
                    array=demo.insertData();
                    break;
                case 2://显示所有数据
                    demo.showData(array,array.length);
                    break;
                case 3:
                    System.out.println("请输入要插入的数据:");
                    int data = sc.nextInt();
                    System.out.println("请输入要插入的位置:");
                    int k = sc.nextInt();
                    demo.insertAtArray(array,data,k);
                    demo.showData(array,array.length);
                    break;
                case 4:
                    demo.divThreee(array);
                    break;
                case 0:
                    System.out.println("程序已退出!!!");
                    System.exit(-1);
                 default:
                     System.out.println("您输入的数字无效，请按提示输入：");

            }
        }
    }
}
