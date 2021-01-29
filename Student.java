package Score;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		// 1.使用scanner，从键盘读入学生的个数
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生的个数：");
		int number = scan.nextInt();
		// 2.创建数组，存储学生的成绩，动态初始化
		int[] scores = new int[number];
		// 3.给数组中的元素赋值
		System.out.println("请依次输入" + number + "学生的成绩：");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scan.nextInt();
		}
		// 4.获取数组中元素的最大值
		int maxScores = 0;
		for (int i = 0; i < scores.length; i++) {
			if (maxScores < scores[i]) {
				maxScores = scores[i];
			}
		}
		// 5.根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
		char levels;
		for (int i = 0; i < scores.length; i++) {
			if (maxScores - scores[i] <= 10) {
				levels = 'A';
			} else if (maxScores - scores[i] <= 20) {
				levels = 'B';
			} else if (maxScores - scores[i] <= 30) {
				levels = 'C';
			} else {
				levels = 'D';
			}
			System.out.println("student " + i + " score is " + scores[i] + " grade is " + levels);
		}
	}
}
