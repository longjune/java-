package ѧ��;

public class Student {
	private String id;
	private String banhao;
	private String name;
	private String sex;
	private int age;

	// ��Ҫ��ȡ˽�г�Ա��ֻ��ͨ������Ĺ����ĳ�Ա�������л�ȡ��get��set��
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
		// �ղι��췽����������������һ�£��޷���ֵ����return���
		System.out.println("��194 ����\n");
	}

	public Student(String id, String banhao, String name, String sex, int age) {	
		//�вι��췽�������������Լ�д��һ�����췽����ϵͳ�������ṩ�ղεĹ��췽��
		//this�ؼ��ֿ������־ֲ������ͳ�Ա����ͬ�������⡣����������ǵ�ǰ��������ã������˸�������ã�this�ؼ��ֱ�ʾ�����¶�������ݣ������Ǿɶ����
		//��Ա����  �ֲ�����
		this.id = id;
		this.banhao = banhao;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public void printInfo() {
		System.out.println("Student ѧ��Ϊ:" + getId() + ",���Ϊ:" + getBanhao()
				+ ", ����Ϊ:" + getName() + ", �Ա�Ϊ:" + getSex() + ", ����Ϊ:"
				+ getAge());
	}

}
