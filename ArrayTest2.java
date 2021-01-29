package com.xiaofengyvan.java;
/*
 * 1.理解
 *   对于二维数组的理解，我们可以看成是一维数组array1有作为另外一个一维数组array2的元素存在。
 *   其实，从数组底层的运行机制来看，其实没有多维数组。
 * 
 * 2.二维数组的使用：
 *   1⃣️二维数组的声明和初始化
 *   2⃣️如何调用数组的指定位置的元素
 *   3⃣️如何获取数组的长度
 *   4⃣️如何遍历数组
 *   规定：二维数组分外层数组元素，内层数组的元素
 *        int[][] arr = new int[4][3];
 *        外层元素：arr[0],arr[1]等
 *        内层元素：arr[0][0],arr[1][2]等
 *   5⃣️数组元素的默认初始化值
 *        针对于初始化方式1:比如：int[][] arr = new int[4][3];
 *           外层元素的初始化值为：地址值；
 *           内层元素的初始化值为：与一维数组初始化值相同；
 *        针对于初始化方式1:比如：int[][] arr = new int[4][];
 *           外层元素的初始化值为：null；
 *           内层元素的初始化值为：不能调用，否则报错空指针异常。
 *   6⃣️数组的内存解析
 *   
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		//1.二维数组的声明和初始化
		int[] arr = new int[] {1,2,3};//一维数组
		//静态初始化
		int[][] arr1 = new int[][] {{1,2,3},{4,5},{6,7,8}};
		//动态初始化1
		String[][] arr2 = new String[3][2];
		//动态初始化2
		String[][] arr3 = new String[3][];
		//错误的情况
		//String[][] arr4 = new String[][4];
		//String[4][3] arr5 = new String[][];
		//int[][] arr6 = new int[4][3]{{1,2,3},{4,5},{6,7,8}};
		
		//正确情况
		int[] arr7[] = new int[][]{{1,2,3},{4,5},{6,7,8}};
		int[] arr8[] = {{1,2,3},{4,5},{6,7,8}};
		
		//2.如何调用指定数组的指定位置的元素
		System.out.println(arr1[0][1]);//2
		System.out.println(arr2[1][1]);//null
		
		arr3[1] = new String[4];
		System.out.println(arr3[1][0]);//null
		System.out.println();
		
		//获取数组的长度
		System.out.println(arr7.length);//3
		System.out.println(arr7[0].length);//3
		System.out.println(arr7[1].length);//2
		System.out.println();
		//如何遍历二维数组
		for(int i=0;i<arr7.length;i++) {
			for(int j=0;j<arr7[i].length;j++) {
				System.out.print(arr7[i][j]+"\t");
			}
			System.out.println();
		}
		
		int[][] arr9 = new int[4][3];
		System.out.println(arr9[0]);//地址值：[I@6f2b958e -> 一维数组int型@地址
		System.out.println(arr9[0][0]);//0
		System.out.println(arr9);//地址值：[[I@1eb44e46 -> 二维数组int型@地址
		
	}
}