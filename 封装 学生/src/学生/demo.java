package 学生;

public class demo {

	public static void main(String[] args) {
		//封装：将对象（类）中的实现细节隐藏，不被外界访问，提高代码的安全性
		Student a = new Student("201912900437", "软工", "龙君", "man", 19);	//创建对象，为成员变量赋值
		a.printInfo();

	}

}
