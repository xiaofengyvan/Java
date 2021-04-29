package com.xiaofengyvan.java;
/*
 * JavaBean是一种java语言写成的可重用组件；
 * 
 * 所谓JavaBean，是指符合以下标准的Java类：
 * 		> 类是公共的；
 * 		> 有一个无参公共的构造器；
 * 		> 有属性，且有对应的get、set方法。
 */

public class CustomerTest2 {
	private int id;
	private String name;

	public CustomerTest2() {

	}

	public CustomerTest2(int i) {
		id = i;
	}

	public void setId(int i) {
		id = i;
	}

	public int getId() {
		return id;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
}
