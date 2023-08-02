package jappo.sec01;

public class Turtle extends Animal implements Swimable{

	
	
	@Override
	public void cry() {
		System.out.println("조용히 웁니다.");
		
	}

	@Override
	public void eat() {
		System.out.println("야무지게 먹습니다.");
		
	}

	@Override
	public void sleep() {
		System.out.println("눈만 감고 잡니다.");
		
	}


	

}
