package ch06.exam02_3_class_method;

public class Main {
	

	public static void main(String[] args) {
		int i=1, j=2, res=0;
		double dres=0;
		// 2. ��ü ����
		//Ŭ������ ������ = new Ŭ������();
		BasicCalculator bc = new BasicCalculator();
		// 3. �޼ҵ� ȣ��(��ü.�޼ҵ��(�Ű�������);)
			//1. �޼ҵ��
		//plus
			//2. �Ű�����
		//bc.plus(i,j);
			//3. ���ϰ� ����
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
