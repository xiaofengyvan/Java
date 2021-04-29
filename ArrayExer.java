package com.xiaofengyvan.java;

import java.util.Scanner;

public class ArrayExer {
	public static void main(String[] args) {
		String[] arr = new String[] { "JJ", "DD", "MM", "BB", "GG", "AA" };
		// 数组的复制（区别于数组变量的赋值：arr1=arr;）
		String[] arr1 = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		// 数组的反转
		// 方法1⃣️
//		for (int i = 0; i < arr.length/2; i++) {
//			String temp = arr[i];
//			arr[i] = arr[arr.length-i-1];
//			arr[arr.length-i-1]= temp;
//		}
		// 方法2⃣️
		for (int i = 0, j = arr.length; i < j; i++, j--) {
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		// 遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		// 查找
		System.out.print("请输入您要查找的元素：");
		Scanner scan = new Scanner(System.in);
		String dest = scan.next();
		boolean isFlag = true;
		for (int i = 0; i < arr.length; i++) {
			if (dest.equals(arr[i])) {
				System.out.println("找到了指定的元素，位置为：" + i);
				isFlag = false;
				break;
			}
		}
		if (isFlag) {
			System.out.println("很抱歉，没有找到指定的元素哦！");
		}
		// 二分法查找
		// 前提：所要查找的数组必须是有序的。
		int[] arr2 = new int[] { -98, -34, 2, 34, 54, 66, 79, 105, 210, 333 };
		System.out.print("请输入您要查找的元素：");
		int dest1 = scan.nextInt();
		boolean isFlag1 = true;
		int head = 0;// 初始的首索引
		int end = arr2.length - 1;// 初始的末索引
		while (head <= end) {
			int middle = (head + end) / 2;
			if (dest1 == arr2[middle]) {
				System.out.println("找到了指定的元素，位置为：" + middle);
				isFlag1 = false;
				break;
			} else if (arr2[middle] > dest1) {
				end = middle - 1;
			} else {
				head = middle + 1;
			}
		}
		if (isFlag1) {
			System.out.println("很抱歉，没有找到指定的元素哦！");
		}
	}
}
