package ch04_ex;

public class Ex6 {

	public static void main(String[] args) {
		 int score=53;
		 // 53 >=90 -> false
		 if(score>=90) {//100-90
			 System.out.println("A����Դϴ�.");
			 System.out.println("������ 100-90�Դϴ�..");
		 }
		 // 53 >=80 -> false
		 else if(score>=80) {// 89-80
			 System.out.println("B����Դϴ�.");
			 System.out.println("������ 89-80�Դϴ�..");
		 }
		// 53 >=70 -> false
		 else if(score>=70) {//79-70
			 System.out.println("C����Դϴ�.");
			 System.out.println("������ 79-70�Դϴ�..");
		 }
		// 53 >=60 -> false
		 else if(score>=60) {//69-60
			 System.out.println("D����Դϴ�.");
			 System.out.println("������ 69-60�Դϴ�..");
		 }
		 else {//60�̸�
			 System.out.println("F����� �ƴմϴ�.");
			 System.out.println("������ 60���� �۽��ϴ�.");
		 }
		 //---------------------------
		 System.out.println("���α׷� ����");
		
	}

}
