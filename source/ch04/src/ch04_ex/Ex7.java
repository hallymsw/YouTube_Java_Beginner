package ch04_ex;

public class Ex7 {

	public static void main(String[] args) {
		int age=-1;
		// -1 >=61 -> f
		if(age>=61) {
			System.out.println("노인");
		}
		// -1 >=31 -> f
		else if(age>=31) { //60-31
			System.out.println("장년층");
		}
		// -1 >=19 -> f
		else if(age>=19) {//30-19
			System.out.println("젊은이");
		}
		// -1 >=8 -> f
		else if(age>=8) {//18-8
			System.out.println("학생");
		}
		// -1 >=0 -> f
		else if(age>=0) {//7-0
			System.out.println("어린이");
		}
		else {//에러 0 이하
			System.out.println("에러");
		}
		//-------------
		System.out.println("프로그램종료");
		
	}

}
