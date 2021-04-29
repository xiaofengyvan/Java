package com.xiaofengyvan.java;
/*
 * 类的结构之三：构造器（或构造方法 constructor）的使用
 * construct：建设、建造。construction：CCB constructor：建造者
 * 
 * 一、构造器的作用
 * 1.创建对象
 * 2.初始化对象的信息
 * 
 * 二、说明：
 * 1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式：权限修饰符 类名(形参列表){}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦我们显式的定义了类的构造器之后，系统就不再提供默认的空参构造器
 * 5.一个类中，至少会有一个构造器。
 * 
 */

public class PersonTest2 {
	public static void main(String[] args) {
		// 创建类的对象：new + 构造器
		Person2 p = new Person2();
		p.eat();

		Person2 p1 = new Person2("Tom");
		System.out.println(p1.name);
	}
}

class Person2 {
	// 属性
	String name;
	int age;

	// 构造器
	public Person2() {
		System.out.println("Person()......");
	}

	public Person2(String n) {
		name = n;
	}

	public void eat() {
		System.out.println("人可以吃饭！");
	}

	public void sleep() {
		System.out.println("人可以睡觉！");
	}

	public void talk(String language) {
		System.out.println("人可以说话，使用的语言是：" + language);
	}
}
