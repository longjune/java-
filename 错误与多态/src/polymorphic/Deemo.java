package polymorphic;

//��ָ̬��ͬ����Ķ����ڵ���ͬһ������ʱ���ֵĶ��ֱ�����̬��è�Ƕ��Ҳ��è��
//��̬Ҫ�м̳л�ʵ�ֵĹ�ϵ��Ҫ�з�����д��Ҫ�и������õ��������

//�����ص㣺
//��Ա�����������б���Ҫ����Ӧ�������������������н�����ָ���
//��Ա�����������б���Ҫ����Ӧ�������������������н����������

//�ô�����ߴ������չ�Ժ�ά����
//�������޷�ʹ���������еĳ�Ա

//��̬������Ϊ�����Ĳ����ͷ���ֵ����ʹ�ã�������ߴ������չ��

public class Deemo {

	public static void main(String[] args) {
		//���������������
		/*Animal a=new Dog();	����ָ���������
		Dog d=new Dog();
		System.out.println(a.age);	//2��a��Animal�࣬���ʵľ���Animal�еı���
		a.eat();//�����⣬*/
	Dog d=new Dog();
	method(d);
	Cat c=new Cat();
	method(c);
	}
	public static void method(Animal a)	//Animal a=new Dog();	Animal  a=new Cat();
	{
		//ͨ����̬��������ͳһ���д��ݣ����ٺ�������д��ʹ������
		a.eat();
	}
}
