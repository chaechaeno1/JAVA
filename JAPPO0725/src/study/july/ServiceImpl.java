package study.july;

/**
 * 서비스 인터페이스를 구현한 serviceImpl
 * 여기서 기능의 동작 방식을 구현
 */

public class ServiceImpl implements Service{
	
	@Override
	public void print() {
		System.out.println("프린트를 동작합니다.");
		
	}
	
	@Override
	public void input() {
		System.out.println("값을 입력받습니다.");
	}
	
	

}
