package 接口;

public class deemo {
	// 局部变量与成员变量
	// java中访问遵守的是就近原则
	// 成员变量：定义在类中方法外 	局部变量：定义在方法的内部或者方法的声明上
	// 成员变量：在内存中位置于堆内存中	 局部变量：在内存中位置于栈内存中
	// 成员变量：随着对象的创建而创建，随着对象的消失而消失 	局部变量：随着方法的创建而创建，随着方法的消失而消失
	// 成员变量：有默认的初始化值 	局部变量：无默认值，必须通过初始化
	public static void main(String[] args) {
		Dog a = new Dog();
		a.breath();
		a.getType("犬科");
		a.run();

		// 栈内存
		// 2.主方法加载到栈内存当中
		// 5.执行创建对象的动作，开辟new Dog();的空间，将成员变量方法进行加载初始化、拷贝
		// 6.生成new Dog();的相应地址值，赋值给相应的a
		// 7.成员方法加载到栈内存当中
		// 8.执行完成员方法中的内容后，该方法从栈内存中消失
		// 9.主方法执行完毕后，从栈内存中消失，断开与栈内存的连接

		// 堆内存
		// 4.进行创建对象Dog a =

		// 方法区
		// 1.先加载deemo.class
		// 3.将Dog.class加载到方法区中，包括其中的成员变量和成员方法
	}
}
