package com.xiaofengyvan.java;

/*
 * 使用二维数组打印一个10行的杨辉三角。
 * 
 * 【提示】
 *  1.第一行有1个元素，第n行有n个元素
 *  2.每一行的第一个元素和最后一个元素都是1
 *  3.从第三行开始，对于非第一个元素和最后一个元素的元素。即：
 *    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 *    
 *    1	
 *    1	1	
 *    1	2	1	
 *    1	3	3	1	
 *    1	4	6	4	1	
 *    1	5	10	10	5	1	
 *    1	6	15	20	15	6	1	
 *    1	7	21	35	35	21	7	1	
 *    1	8	28	56	70	56	28	8	1	
 *    1	9	36	84	126	126	84	36	9	1
 */
public class YangHuiTest {
	public static void main(String[] args) {
		// 1.声明并初始化二维数组
		int[][] yangHui = new int[10][];
		for (int i = 0; i < yangHui.length; i++) {
			yangHui[i] = new int[i + 1];
			// 2.给数组的元素赋值
			// 1⃣️给首末行赋值
			yangHui[i][0] = yangHui[i][i] = 1;
			// 2⃣️给其余元素赋值
			for (int j = 1; j < yangHui[i].length - 1; j++) {
				yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
			}
		}
		// 3.遍历二维数组
		for (int i = 0; i < yangHui.length; i++) {
			for (int j = 0; j < yangHui[i].length; j++) {
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();
		}
	}
}