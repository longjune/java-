package ����;

public abstract class Animal {
	// �����и����ȡ��ʱ����Щ����ÿ�������ʵ�ַ�ʽ����̫һ�����Ϳ����������������Ϊ���󷽷�
	// �г��󷽷���һ���ǳ�����
	//�Գ�Ա�����ͳ�Ա����û��Ҫ�󣺱����ͳ��������󷽷��ͷǳ��󷽷������췽������ͬʱ����	
	//�����಻��ֱ�Ӵ���ʹ��
	private String name;
	private int age;
	private String color;

	// �������п����г���
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
