package �ӿ�;

public class Dog implements Animal,Pet{
	//��ͨ��implements����ʵ�ֶ���ӿ�
	@Override
	public void breath() {
		System.out.println("�����Ժ���");
	}

	@Override
	public void getType(String type) {
	}
	public void run(){
		System.out.println("�������������");
	}
}
