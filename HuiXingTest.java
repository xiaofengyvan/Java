package com.xiaofengyvan.java;

/*
 * 【笔试题】
 *  输入任意一个整数，输出它的回形数字矩阵；例如：
 *  5
 *  1  2  3  4  5
 *  16 17 18 19 6
 *  15 24 25 20 7
 *  14 23 22 21 8
 *  13 12 11 10 9
 */
import java.util.Scanner;

public class HuiXingTest {
	public static void main(String[] args) {
		// 1.获取输入的值
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = scan.nextInt();
		
		// 2.声明并初始化二维数组
		int[][] arr = new int[num][num];
		int count = 0; // 显示的数据
		int maxX = num - 1; // x轴的最大下标
		int maxY = num - 1; // y轴的最大下标
		int minX = 0; // x轴的最小下标
		int minY = 0; // y轴的最小下标

		while (minX <= maxX) {
			//上：赋值
			for (int x = minX; x <= maxX; x++) {
				arr[minY][x] = ++count;
			}
			minY++;
			//右：赋值
			for (int y = minY; y <= maxY; y++) {
				arr[y][maxX] = ++count;
			}
			maxX--;
			//下：赋值
			for (int x = maxX; x >= minX; x--) {
				arr[maxY][x] = ++count;
			}
			maxY--;
			//左：赋值
			for (int y = maxY; y >= minY; y--) {
				arr[y][minX] = ++count;
			}
			minX++;
		}
		
		// 3.遍历二维数组
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
