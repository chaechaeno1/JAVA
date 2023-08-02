package jappo.sec01;

public class Pigeon extends Animal implements Flyable{

	@Override
	public void fast() {
		System.out.println("빠르게 날아다닙니다.");
		
	}

	@Override
	public void cry() {
		System.out.println("까악까악하고 웁니다.");
		
	}

	@Override
	public void eat() {
		System.out.println("부리로 조아먹습니다.");
		
	}

	@Override
	public void sleep() {
		System.out.println("서서 잡니다.");
		
	}

}
