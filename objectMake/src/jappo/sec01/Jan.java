package jappo.sec01;

public class Jan extends Human implements Programmer, Swimable{
	

	@Override
	public void coding() {
		System.out.println("Coding을 주로 합니다.");
		
	}

	@Override
	public void move() {
		System.out.println("느리게 움직입니다.");
		
	}

	@Override
	public void cry() {
		System.out.println("엉엉 웁니다.");
		
	}


	@Override
	public void eat() {
		System.out.println("천천히 꼭꼭 씹어먹습니다.");
		
	}

	@Override
	public void sleep() {
		System.out.println("두다리 쭉 뻗고 잡니다.");
		
	}

	@Override
	public void talkSlow() {
		System.out.println("천천히 말을 합니다.");
		
	}

	

}
