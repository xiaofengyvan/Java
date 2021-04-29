package com.xiaofengyvan.java;

public class TriAngleTest {
	public static void main(String[] args) {
		TriAngle a = new TriAngle();
		a.setBase(3);
		a.setHeight(4);
		int t = a.getAreas();
		System.out.println("三角形的面积为：" + t);
	}
}
