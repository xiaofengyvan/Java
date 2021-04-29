package com.xiaofengyvan.java;

/*
 * this 关键字的使用：
 * 
 * 1.this可以用来修饰：属性、方法、构造器。
 * 
 * 2.this修饰属性和方法：
 *   this理解为：当前对象或当前创建的对象。
 *   
 *   2.1 在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，调用当前对象属性或方法。但是通常情况下，
 *   我们都选择省略"this."。特殊情况下，如果方法的形参和类的属性同名时，我们必须显式的使用"this.变量"的方式，
 *   表明此变量是属性，而非形参。
 *   
 *   2.2 在类的构造器中，我们可以使用"this.属性"或"this.方法"的方式，调用当前正在创建对象属性或方法。
 *   但是通常情况下，我们都选择省略"this."。特殊情况下，如果构造器方法的形参和类的属性同名时，
 *   我们必须显式的使用"this.变量"的方式，表明此变量是属性，而非形参。
 *   
 * 3.this调用构造器
 *   1⃣️我们在类的构造器中，可以显式的使用"this(形参列表)"方式，调用本类中指定的其他构造器
 *   2⃣️构造器中不能通过"this(形参列表)"方式调用自己
 *   3⃣️如果一个类中有n个构造器，则最多有n-1构造器中使用了"this(形参列表)"
 *   4⃣️规定："this(形参列表)"必须声明在当前构造器的首行
 *   5⃣️构造器内部，最多只能声明一个"this(形参列表)"，用来调用其他的构造器
 */

public class PersonTest3 {
	public static void main(String[] args) {
		Person3 p = new Person3();
		p.setAge(1);
		System.out.println(p.getAge());
		p.eat();
	}
}

class Person3 {
	private String name;
	private int age;

	public Person3() {
		this.eat();
	}

	public Person3(int age) {
		this();
		this.study();
	}

	public Person3(String name, int age) {
		this(age);
		this.study();
	}

	public Person3(int age, String name) {
		this(age);
		this.study();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void eat() {
		System.out.println("人吃饭！");
		this.study();
	}

	public void study() {
		System.out.println("人学习！");
	}
}
