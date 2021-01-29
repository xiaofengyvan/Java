package com.xiaofengyvan.java;

/*
 *  【笔试题】
 *   创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，
 *   且是随机赋值。同时，要求元素的值各不相同。
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		// 方式一
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 30) + 1;
			boolean flag = false;
			while (true) {
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						flag = true;
						break;
					}
				}
				if (flag) {
					arr[i] = (int) (Math.random() * 30) + 1;
					flag = false;
					continue;
				}
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		// 方式二
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 30) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
