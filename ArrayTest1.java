package com.xiaofengyvan.java;

/*
 * 【考查】求数值型中元素的最大值，最小值，平均数，总和等
 * 
 *  定义一个int型的一维数组，包含10个元素，分别赋一些随机的整数；
 *  然后求出所有元素的最大值，最小值，和值，平均值，并输出出来；
 *  要求：所有随机数都是两位数。 【10，99】
 *  公式：获取[a,b]范围的随机数：(int)(Math.random()*(b-a+1))+a
 */

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)((Math.random()*90)+10);
		}
		//遍历
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		//求数组元素的最大值
		int maxValue = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		System.out.println("数组元素中的最大值："+maxValue);
		//求数组元素的最小值
		int minValue = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		System.out.println("数组元素中的最小值："+minValue);
		//求数组元素的总和
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("数组元素的总和为："+sum);
		//求数组元素的平均值
		double avgValue;
		avgValue = (double)sum/arr.length;
		System.out.println("数组元素的平均值为："+avgValue);
	}
}