package ch06.exam02_3_class_method;

public class CalculatorExample {
	public static void main(String[] str)
	{
		int a=1, b=10, res=0;
		// 객체 생성
		// 클래스명 변수명 = new 클래스명();
		Calculator cal = new Calculator();
		// 호출 객체.메소드 
		//1. 메소드명
		//cal.getSum
		//2. 매개변수 맞춰주기
//		cal.getSum(a,b);
		//3 리턴값 맞추기
		res=cal.getSum(a,b);
		System.out.println(res);
	}
	

}

