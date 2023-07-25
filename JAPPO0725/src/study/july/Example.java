package study.july;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Example {

	public static void main(String[] args) {
		//다형성 - 객체지향의 특징
		//정의
		
		List<String> arrayList = new ArrayList<>();
		List<String> LinkedList = new LinkedList<>();
		
		Map<String, String> hashMap = new HashMap<>();
		Map<String, String> treeMap = new TreeMap<>();

		//key value
		
		//리스트는 value
		List<String> list = new ArrayList<>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		
		//리스트는 순서 보장
		//System.out.println(list.get(0));
		//System.out.println(list.get(1));
		//System.out.println(list.get(2));
		
		//map은 key value
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"하나");
		map.put(2,"둘");
		map.put(0,"셋");
		
		//map은 순서가 보장되지 않기 때문에 key값으로 데이터를 가져옴
		System.out.println(map.get(0));
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		
		//key값은 중복될 수 없음 -> key값이 같으면 덮어써진다
		map.put(0, "새로운하나");
		System.out.println(map.get(0));
		
		//객체만들기 귀찮을때 map씀
		Map<String, String> person = new HashMap<>();
		person.put("age","하나");
		person.put("tall","백칠십");
		person.put("telphone","010-9999-8888");
		
		
	}

}
