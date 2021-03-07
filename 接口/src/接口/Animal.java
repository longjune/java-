package 接口;

public interface Animal {
	// 接口，一个更抽象的类。里面只允许有常量、抽象方法、默认方法、静态方法。不允许有构造方法，也不能创建对象使用
	//接口与接口之间则是继承的关系，允许多继承
	public static final int id = 1; // 常量

	public abstract void breath(); // 抽象方法

	public void getType(String type);// 默认的方法

}
