package error;

public class Error_exm {
	// try-catch-finally ���쳣���в���ʹ���
	public static void main(String[] args) {
		// String getMessage() ���ش�throwable����ϸ��Ϣ�ַ���
		// void printStckTrace() ����throwable����׷�����ֵ��׼������
		// void printStackTrace(PrintStream s) ����throwable����׷�������ָ����IO��
		// String getMessage() ���ش�throwable����Ϣ��Ϣ�ַ�������̵���Ϣ��
		try {	//���ܳ�������Ĵ���
			int num1 = 5;
			int num2 = 0;
			int result = num1 / num2;
			System.out.println(result);
		} catch (ArithmeticException a) {	//�������쳣���бȶԣ��ȶԳɹ���ִ��catch�еĴ���
			a.printStackTrace();	//���ӡ�����쳣����Ϣ
		} finally {
			// finallyһ���������ͷŲ��������ӡ���Դ�������Ƿ�����쳣��finally����ִ�е�
			System.out.println("�ͷŵ���ϵͳ����");
		}
		System.out.println("�����ҵĺ�������");
	}
}
