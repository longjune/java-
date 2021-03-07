package polymorphic;

//多态指不同的类的对象在调用同一个方法时呈现的多种变现形态（猫是动物，也是猫）
//多态要有继承或实现的关系，要有方法重写，要有父类引用的子类对象

//访问特点：
//成员变量：父类中必须要有相应变量，否则编译出错；运行结果体现父类
//成员方法：父类中必须要有相应方法，否则编译出错；运行结果体现子类

//好处：提高代码的扩展性和维护性
//坏处：无法使用子类特有的成员

//多态可以作为方法的参数和返回值进行使用，可以提高代码的扩展性

public class Deemo {

	public static void main(String[] args) {
		//父类引用子类对象
		/*Animal a=new Dog();	父类指向子类对象
		Dog d=new Dog();
		System.out.println(a.age);	//2，a是Animal类，访问的就是Animal中的变量
		a.eat();//狗吃肉，*/
	Dog d=new Dog();
	method(d);
	Cat c=new Cat();
	method(c);
	}
	public static void method(Animal a)	//Animal a=new Dog();	Animal  a=new Cat();
	{
		//通过多态，将参数统一进行传递，减少函数的重写，使代码简洁
		a.eat();
	}
}
