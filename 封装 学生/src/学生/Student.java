package 学生;

public class Student {
	private String id;
	private String banhao;
	private String name;
	private String sex;
	private int age;

	// 想要获取私有成员，只能通过额外的公开的成员方法进行获取（get、set）
	public String getId() {
		return id;
	}

	public String getBanhao() {
		return banhao;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public Student() {
		// 空参构造方法：方法名与类名一致，无返回值，无return语句
		System.out.println("软工194 龙君\n");
	}

	public Student(String id, String banhao, String name, String sex, int age) {	
		//有参构造方法，且若我们自己写了一个构造方法，系统将不再提供空参的构造方法
		//this关键字可以区分局部变量和成员变量同名的问题。且它代表的是当前对象的引用：若换了个对象调用，this关键字表示的是新对象的数据，而不是旧对象的
		//成员变量  局部变量
		this.id = id;
		this.banhao = banhao;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public void printInfo() {
		System.out.println("Student 学号为:" + getId() + ",班号为:" + getBanhao()
				+ ", 姓名为:" + getName() + ", 性别为:" + getSex() + ", 年龄为:"
				+ getAge());
	}

}
