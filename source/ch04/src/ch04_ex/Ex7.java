package ch04_ex;

public class Ex7 {

	public static void main(String[] args) {
		int age=-1;
		// -1 >=61 -> f
		if(age>=61) {
			System.out.println("����");
		}
		// -1 >=31 -> f
		else if(age>=31) { //60-31
			System.out.println("�����");
		}
		// -1 >=19 -> f
		else if(age>=19) {//30-19
			System.out.println("������");
		}
		// -1 >=8 -> f
		else if(age>=8) {//18-8
			System.out.println("�л�");
		}
		// -1 >=0 -> f
		else if(age>=0) {//7-0
			System.out.println("���");
		}
		else {//���� 0 ����
			System.out.println("����");
		}
		//-------------
		System.out.println("���α׷�����");
		
	}

}
