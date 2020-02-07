package ch06.exam02_3_class_method;

class BasicCalculator {
	//1.메소드 선언
	//public 리턴타입 메소드명(매개변수들){}
	public int plus(int x, int y) {//1,2
		int ret=0;
		ret = x+y;
		return ret;//3
	}
	public int minus(int x, int y) {
		int ret=0;
		ret = x-y;
		return ret;
	}
	public int mul(int x, int y) {
		int ret=0;
		ret = x*y;
		return ret;
	}
	public double divide(int x, int y) {
		double ret=0;
		ret = (double)x/y;
		return ret;
	}


}
