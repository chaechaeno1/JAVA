package jappo.sec01;

public class CreatureMain {

	public static void main(String[] args) {
		
		//방법1. 변수로 호출
		Turtle turtle = new Turtle();
		Jan jan = new Jan();
		
		//방법2. Animal 타입 변수로 자동 타입 변환
		Animal animal = null;
		animal = new Pigeon();
		
		turtle.bite();
		jan.coding();
	

	}

}
