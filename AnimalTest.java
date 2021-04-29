package com.xiaofengyvan.java;

/*
 * 面向对象的特征一：封装与隐藏
 * 
 * 一、问题的引入：
 *     当我们创建一个类的对象以后，我们可以通过"对象.属性"的方式，对对象的属性进行赋值。这里，赋值操作要受属性的数据类型和存储范围的制约。
 *     除此之外，没有其他制约条件。但是，在实际问题中，我们往往需要给属性赋值加入额外的限制条件。这个条件就不能在属性声明时体现，我们只能
 *     通过方法进行限制条件的添加。（比如 set）同时，我们需要避免用户再使用"对象.属性"的方式对属性进行赋值。则需要将属性声明为私有（private）
 *     -->此时，针对属性就体现了封装性。
 *     
 * 二、封装性的体现：
 *    我们将类的属性XXX私有化（private），同时，提供公共（public）方法来获取（getXxx）和设置（setXxx）
 *    
 *    拓展：封装性的体现：1⃣️类的属性私有化 2⃣️不对外暴露的私有的方法 3⃣️单例模式...
 *    
 * 三、封装性的体现，需要权限修饰符来配合。
 *   1）Java规定的4中权限（从小到大）：private、缺省、protected、public
 *   2）4中权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 *   3）具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 *   修饰类的话，只能使用：缺省、public
 *    
 */

public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "大黄";
		a.age = 1;
//		a.legs = 4;//The field Animal.legs is not visible

		a.show();

//		a.legs=-4;//The field Animal.legs is not visible
		a.setLegs(6);
		a.show();
		a.setLegs(-6);

//		a.legs=-4;//The field Animal.legs is not visible
		a.show();
	}
}

class Animal {
	String name;
	int age;
	private int legs;

	public void setLegs(int l) {
		if (l >= 0 && l % 2 == 0) {
			legs = l;
//			throw new RuntimeException("The legs entered are illegal！");
		} else {
			legs = 0;
		}
	}

	public int getLegs() {
		return legs;
	}

	public void eat() {
		System.out.println("开始进食");
	}

	public void show() {
		System.out.println("name = " + name + ",age = " + age + ",legs = " + legs);
	}
}
