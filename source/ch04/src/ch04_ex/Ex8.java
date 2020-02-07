package ch04_ex;

public class Ex8 {

	public static void main(String[] args) {
		 int score=53;
		 // 53 >=90 -> false
		 if(score>=90) {//100-90
			if(score>=95) {//100-95
				 System.out.println("A+등급입니다.");
			}
			else {//94-90
				System.out.println("A-등급입니다.");
			}
		 }
		 // 53 >=80 -> false
		 else if(score>=80) {// 89-80
			 System.out.println("B등급입니다.");
			 System.out.println("점수가 89-80입니다..");
		 }
		// 53 >=70 -> false
		 else if(score>=70) {//79-70
			 System.out.println("C등급입니다.");
			 System.out.println("점수가 79-70입니다..");
		 }
		// 53 >=60 -> false
		 else if(score>=60) {//69-60
			 System.out.println("D등급입니다.");
			 System.out.println("점수가 69-60입니다..");
		 }
		 else {//60미만
			 System.out.println("F등급이 아닙니다.");
			 System.out.println("점수가 60보다 작습니다.");
		 }
		 //---------------------------
		 System.out.println("프로그램 종료");
		
	}

}
