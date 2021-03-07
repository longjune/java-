package 抽象;

public class Pet {
	private int cute;
	private String buetiful;

	public Pet(int cute, String buetiful) {
		//在继承中，子类重写父类的方法（Cat中的eat）后，子类对象就无法访问父类被重写的方法（Animal中的eat）。
		//super关键字用来访问父类的成员（父类的成员变量、成员方法、构造方法）,		super.eat
		super();
		this.cute = cute;
		this.buetiful = buetiful;
	}

}
