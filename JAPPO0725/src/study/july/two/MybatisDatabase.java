package study.july.two;

public class MybatisDatabase implements Database{

	@Override
	public String find() {
		System.out.println("Mybatis로 결과값을 찾습니다.");
		return "결과값";
	}

	@Override
	public void save() {
		System.out.println("Mybatis로 값을 저장합니다.");
		
	}

	@Override
	public void delete() {
		System.out.println("Mybatis로 값을 삭제합니다.");
		
	}
	


}
