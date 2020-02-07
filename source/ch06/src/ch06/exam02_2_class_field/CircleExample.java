package ch06.exam02_2_class_field;

public class CircleExample {
	public static void main(String[] args) {
		//2. 객체 생성 형식
		//클래스명 변수명 = new 클래스명();
		Circle pizza = new Circle();
		//3. 필드 사용
		//객체.필드명=값;
		pizza.radius=10;
		pizza.name="자바피자";
		
		System.out.println(pizza.radius+","+pizza.name);
		
		
		//2. 객체 생성 형식
				//클래스명 변수명 = new 클래스명();
		Circle donut = new Circle();
		
		//3. 필드 사용
				//객체.필드명=값;
		donut.radius=2;
		donut.name="java donut";
		System.out.println(donut.radius+","+donut.name);
	}
}

