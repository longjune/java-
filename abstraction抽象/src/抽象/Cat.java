package ����;

public class Cat extends Animal {
//�̳У�ֻ�ܼ̳и����еĹ����ĳ�Ա�����������ж���Ĺ��ܣ�����ֻ�ܱ��ȼ̳С�
	@Override
	public void eat() {
		System.out.println("è����");
	}

	public Cat() {
		//Ĭ�Ϸ���Animal�еĿղη�������Ϊ�вι��췽����super����Ҳ��Ҫ�����Ӧ�ľֲ�����
		super();
	}

}
