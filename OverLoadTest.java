package com.xiaofengyvan.java;

/*
 * 方法的重载(Overload) Loading...
 * 
 * 1.定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
 * 
 * 		"两同一不同"：同一个类、相同方法名
 * 					参数列表不同：参数个数不同，参数类型不同
 * 
 * 2.举例：
 * 		Arrays类中重载的 sort()/binarySearch()
 * 
 * 3.判断是否是重载：
 * 		跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系！
 * 
 * 4.再通过对象调用方法时，如何确定某一个指定的方法：
 * 		方法名 ---> 参数列表
 *
 */

public class OverLoadTest {
	public void getSum(int i, int j) {
		System.out.println(i + j);
	}

	public void getSum(double d1, double d2) {
		System.out.println(d1 + d2);
	}
}
