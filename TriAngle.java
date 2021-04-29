package com.xiaofengyvan.java;

/*
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，同时声明公共方法访问私有变量。
 * 此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 * 
 */
public class TriAngle {
	private int base;
	private int height;

	public TriAngle() {
		System.out.println("TriAngle Running ...");
	}

	public TriAngle(int b, int h) {
		base = b;
		height = h;
		System.out.println("Base为" + base + ";Height为" + height);
	}

	public void setBase(int b) {
		base = b;
	}

	public int getBase() {
		return base;
	}

	public void setHeight(int h) {
		height = h;
	}

	public int getHeight() {
		return height;
	}

	public int getAreas() {
		return base * height * 1 / 2;
	}

	public int getAreas(int b, int h) {
		base = b;
		height = h;
		return base * height * 1 / 2;
	}
}
