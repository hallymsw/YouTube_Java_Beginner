package ch06.exam02_2_class_field;

public class Main {
	

	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone();
//		System.out.println(sp1.disSize);
//		System.out.println(sp1.color);
//		System.out.println(sp1.bandSpeed);
//		System.out.println(sp1.company);
		sp1.color="HD";
		sp1.bandSpeed=500;
//		System.out.println(sp1.disSize);
//		System.out.println(sp1.color);
//		System.out.println(sp1.bandSpeed);
//		System.out.println(sp1.company);
		SmartPhone sp2 = new SmartPhone();
		
		System.out.println(sp2.disSize);
		System.out.println(sp2.color);
		System.out.println(sp2.bandSpeed);
		System.out.println(sp2.company);
		
		sp2.disSize=80;
		sp2.color="QHD";
		sp2.bandSpeed=2000;
		sp2.company="SS";
		System.out.println("------- AFTER --------");
		System.out.println(sp2.disSize);
		System.out.println(sp2.color);
		System.out.println(sp2.bandSpeed);
		System.out.println(sp2.company);
		// �ٸ� Ŭ���� �ʵ� ��� ���
//		�ʵ尪�� �������� ������
//		����=��ü.�ʵ�;
		int i=0, j=1;
		i=j;
//		�ʵ尪�� �����ϰ� ������
//		��ü.�ʵ�=����;
		
		//���� Ŭ���� �ʵ� ��� ���
//		�ʵ尪�� �������� ������
//		����=�ʵ�;
//		int i=0, j=1;
//		i=j;
//		�ʵ尪�� �����ϰ� ������
//		�ʵ�=����;


	}

}
