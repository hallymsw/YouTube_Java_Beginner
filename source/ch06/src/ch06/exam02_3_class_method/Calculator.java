package ch06.exam02_3_class_method;

class Calculator {
	int radius;
	String name;
	//1. 메소드 선언
	//public 리턴타입 메소드(매개변수들){
//	}
	//x -> 1, y -> 10
	public int getSum(int x, int y) {
		int sum=0;
		sum = x+y;
		//1. 메소드명
		//printSum
		//2. 매개변수 맞춰주기
		printSum(sum);
		//3 리턴값 맞추기
		return sum;
	}
	void printSum(int s) {
		System.out.println("printSum : "+s);
	}

}
