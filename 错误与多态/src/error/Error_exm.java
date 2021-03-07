package error;

public class Error_exm {
	// try-catch-finally 对异常进行捕获和处理
	public static void main(String[] args) {
		// String getMessage() 返回此throwable的详细消息字符串
		// void printStckTrace() 将此throwable及其追踪输出值标准错误流
		// void printStackTrace(PrintStream s) 将此throwable及其追踪输出到指定的IO流
		// String getMessage() 返回此throwable的消息消息字符串（简短的消息）
		try {	//可能出现问题的代码
			int num1 = 5;
			int num2 = 0;
			int result = num1 / num2;
			System.out.println(result);
		} catch (ArithmeticException a) {	//与算数异常进行比对，比对成功就执行catch中的代码
			a.printStackTrace();	//会打印出现异常的消息
		} finally {
			// finally一般适用于释放产生的连接、资源，无论是否出现异常，finally都会执行到
			System.out.println("释放掉了系统资料");
		}
		System.out.println("这是我的后续代码");
	}
}
