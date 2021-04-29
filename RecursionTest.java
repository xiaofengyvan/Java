package com.xiaofengyvan.java;

/*
 * 递归方法的使用（了解）
 * 1.递归方法：一个方法体内调用它自身。
 * 2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但是这种重复执行无须循环控制。
 *   递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 *   
 * 例题：
 * 1.什么是方法的重载？
 *   "两同一不同":同一个类、相同方法名；参数列表不同。
 *   如何调用确定的方法：方法名->参数列表
 * 
 * 2.说明Java方法中的参数传递机制的具体体现？
 *   基本数据类型：数据值
 *   引用数据类型：地址值（含变量的数据类型）
 *   Person p1 = new Person();
 *   User u1 = p1;//编译错误 （逆向思维、反证法）
 *   
 * 3.成员变量和局部变量在声明的位置上、是否有默认初始化值上、
 *   是否能有权限修饰符修饰上、内存分配的位置上有何不同？
 *   
 * 4.谈谈return关键字的使用
 * 
 * 5.提供如下代码的内存解析
 * 
 * 1）内存结构：栈（局部变量）、堆（new出来的结构：对象（非static成员变量）、数组）
 * 2）变量：成员变量 vs 局部变量（方法内、方法形参、构造器内、构造器形参、代码块内）
 */

public class RecursionTest {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		RecursionTest test = new RecursionTest();
		int sum2 = test.getSum(100);
		System.out.println(sum2);

		int n = 30;
		for (int i = 1; i <= n; i++) {
			System.out.print(test.fibonacciList(i) + "\t");
		}
	}

	public int getSum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + getSum(n - 1);
		}
	}

	public int getProduct(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * getProduct(n - 1);
		}
	}

	// 已知有一个数列：f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),
	// 其中n是大于0的整数，求f(10)的值。
	public int getList(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 4;
		} else {
			return 2 * getList(n - 1) + getList(n - 2);
		}
	}

	// 输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
	// 1 1 2 3 5 8 13 21 34 55
	// 规律：一个数等于前两个数之和
	// 要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来。
	public int fibonacciList(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		} else {
			return fibonacciList(n - 1) + fibonacciList(n - 2);
		}
	}
}
