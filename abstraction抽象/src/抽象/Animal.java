package 抽象;

public abstract class Animal {
	// 当进行父类抽取的时候，有些方法每个子类的实现方式都不太一样，就可以让这个方法定义为抽象方法
	// 有抽象方法的一定是抽象类
	//对成员变量和成员方法没有要求：变量和常量、抽象方法和非抽象方法、构造方法可以同时存在	
	//抽象类不能直接创建使用
	private String name;
	private int age;
	private String color;

	// 抽象类中可以有常量
	final int number = 10;

	public Animal() {
		super();
	}

	public Animal(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	public abstract void eat();

}
