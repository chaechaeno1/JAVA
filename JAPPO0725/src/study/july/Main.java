package study.july;

public class Main {

	public static void main(String[] args) {
		//앞은 인터페이스                  뒤는 구현체
		//다형성을 위해서 인터페이스로 정의하는게 낫다
		//DIP(의존 역전 원칙)
		Service service = new ServiceImplV2();
		
		//이렇게 써도 됨
		ServiceImpl serviceImpl = new ServiceImpl();
		ServiceImplV2 serviceImplV2 = new ServiceImplV2();
		
		service.print();
		service.input();
		
		
	}

}
