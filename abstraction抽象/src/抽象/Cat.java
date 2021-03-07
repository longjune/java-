package 抽象;

public class Cat extends Animal {
//继承，只能继承父类中的公共的成员。若父类中有多余的功能，子类只能被迫继承。
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

	public Cat() {
		//默认访问Animal中的空参方法，若为有参构造方法，super中则也需要添加相应的局部变量
		super();
	}

}
