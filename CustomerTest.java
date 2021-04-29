package com.xiaofengyvan.java;

/*
 * 类中方法的声明和使用
 * 
 * 方法：描述类应该具有的功能。
 * 比如：Math类：sqrt() \random() \...
 * 		Scanner类：nextXxx() ...
 * 		Arrays类：sort() \ binarySearch() \ toString() \ equals() \ ...
 * 
 * 1.举例：
 * public void eat(){}
 * public void sleep(int hour){}
 * public String getName(){}
 * public String getNation(String nation){}
 * 
 * 2.方法的声明：权限修饰符 返回值类型 方法名（形参列表）{
 * 					方法体
 * 				}
 *   注意：static、final、abstract 来修饰的方法，后面再说。
 *   
 * 3.说明：
 * 		3.1 关于权限修饰符：
 * 			Java 规定的4种权限修饰符：private、public、缺省、protected ---> 封装性再细说
 * 
 * 		3.2 返回值类型：有返回值 vs 没有返回值
 * 				3.2.1 如果方法有返回值，则必须在方法声明时，指定返回值的类型。
 * 					  同时，方法中，需要使用return关键字来返回指定类型的变量或者常量："return数据"。
 * 					  如果方法没有返回值，则方法声明时，使用void来表示。通常，没有返回值的方法中，就不使用return。
 * 					  但是，如果使用的话，只能"return;"表示结束此方法的意思。
 * 
 * 				3.2.2 我们定义方法该不该有返回值？
 * 					  1）题目要求
 * 					  2）凭经验
 * 
 * 				3.3 方法名：属于标识符，遵循标识符的规则和规范，即"见名知意"
 * 
 * 				3.4 形参列表：方法可以声明0个，1个，或者多个形参。
 * 					  1）题目要求
 * 					  2）凭经验：具体问题具体分析
 * 
 * 				3.5 方法体：方法功能的体现。
 * 
 * 4.return 关键字使用：
 *  	1.使用范围：使用在方法中
 *  	2.作用：1）结束方法
 *  		   2）针对有返回值类型的方法，使用"return <数据>"方法返回所要的数据。
 *  	3.注意点：return 关键字后面不可以声明执行语句。
 *  
 * 5.方法的使用中，可以调用当前类的属性或者方法
 * 			特殊的：方法A中又调用了方法A：递归方法。
 *   方法中，不可以定义方法。
 */
public class CustomerTest {
	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.eat();
	}
}
//客户类
class Customer{
	String name;
	public int age;
	boolean isMale;
	
	public void eat() {
		System.out.println("客户开始吃饭！");
	}
	
	public void sleep(int hour) {
		System.out.println("休息了"+hour+"个小时！");
	}

	public String getName() {
		return name;
	}
	
	public String getNation(String nation) {
		String info = "我的国籍是："+nation;
		return info;
	}
}