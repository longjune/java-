package 接口;

public class Dog implements Animal,Pet{
	//类通过implements可以实现多个接口
	@Override
	public void breath() {
		System.out.println("狗可以呼吸");
	}

	@Override
	public void getType(String type) {
	}
	public void run(){
		System.out.println("狗是人类的朋友");
	}
}
