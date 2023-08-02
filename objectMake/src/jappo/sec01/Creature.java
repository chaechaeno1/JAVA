package jappo.sec01;

public abstract class Creature {
	public String name;
	
	public void move() {
		System.out.println("움직입니다.");
	};
	public abstract void cry();
	public abstract void eat();
	public abstract void sleep();
	
}
