package ch06.exam02_3_class_method;

public class Main {
	

	public static void main(String[] args) {
		int i=1, j=2, res=0;
		double dres=0;
		// 2. 객체 생성
		//클래스명 변수명 = new 클래스명();
		BasicCalculator bc = new BasicCalculator();
		// 3. 메소드 호출(객체.메소드명(매개변수들);)
			//1. 메소드명
		//plus
			//2. 매개변수
		//bc.plus(i,j);
			//3. 리턴값 적용
		res=bc.plus(i,j);//3
		System.out.println("+ : "+res);
		
		i=4;
		j=2;
		res=bc.minus(i,j);//4,2 -> 2
		System.out.println("- : "+res);
		
		i=3;
		j=3;
		res=bc.mul(i,j);//3,3 -> 9
		System.out.println("* : "+res);
		
		i=10;
		j=4;
		dres=bc.divide(i,j);//10,4 -> 2.5
		System.out.println("/ : "+dres);
	}

}
