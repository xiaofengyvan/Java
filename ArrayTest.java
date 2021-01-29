package com.xiaofengyvan.java;

/**
 * 
 * @author yvan;
 * @version 1.0;
 * @mail 18792085335@163.com;
 *
 * 一. 数组的概述
 *  1.数组的理解：Array（数组），是多个相同类型的数据按照一定顺序排列的集合，
 *  并使用一个名字命名，并通过编号的方式对这些数据进行管理。
 * 
 *  2.数组的相关概念：
 *  数组名
 *  元素
 *  角标/下标/索引
 *  数组的长度：元素的个数；
 *  
 *  3.数组的特点：
 *  1）数组是有序排列的；
 *  2）数组属于引用数据类型的变量；数组的元素既可以是基本数据类型，也可以是引用数据类型；
 *  3）创建数组对象会在内存中开辟一整块连续的内存空间；
 *  4）数组的长度一旦确定就不能修改。
 *  
 *  4.数组的分类
 *  1）按照维度：一维数组，二维数组，...
 *  2）按照数组元素的类型：基本数据类型元素的数组，引用数据类型元素的数组。
 *  
 *  5.数组的默认初始化值
 *    > 数组元素是整型：0
 *    > 数组元素是浮点型：0.0
 *    > 数组元素是char型：0或'\u0000',而非'0'
 *    > 数组元素是boolean型：false
 *    > 数组元素是引用数据类型：null
 */

public class ArrayTest {
	public static void main(String[] args) {
		int num;//声明
		num = 10;//初始化
		int id = 1001;//声明+初始化
		
		int[] ids;//声明
		//1.1 静态初始化：数组的初始化和数组元素的赋值操作同时进行
		ids = new int[] {1001,1002,1003,1004};
		//1.2 动态初始化：数组的初始化和数组元素的赋值操作分开进行
		String[] names = new String[5];
		
		//错误的写法：
		//int[] arr1 = new int[];
		//int[5] arr2 = new int[5];
		//int[] arr3=new int[3]{1,2,3};
		
		//总结：数组一旦初始化完成，其长度就确定了。
		
		//2.如何调用数组的指定位置的元素：通过索引的方式调用。
		//数组的索引是从0开始的，到数组的长度-1结束。
		names[0] = "张三";
		names[1] = "王五";
		names[2] = "李四";
		names[3] = "王麻子";
		names[4] = "李川枫"; 
		
		//3.如何获取数组的长度。 
		//属性：length
		System.out.println(names.length);
		System.out.println(ids.length);
		
		//4.如何遍历数组
		for(int i = 0;i < names.length;i++) {
			System.out.println(names[i]);
		}
		//5.数组元素的默认初始化值
		int[] arr = new int[4];
		for (int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}
}