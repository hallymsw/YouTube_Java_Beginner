package ch05_pr;

public class Pr1_2 {

	public static void main(String[] args) {
		int i=0;
		
			//1-2 �迭������ �����ϸ鼭 �����͸� ������ ������ Ȯ��
		int[] arrayInt = new int[7];
		//value : 0 0 0 0 0 0 0 
		//index : 0 1 2 3 4 5 6 
		for(i=0;i<=6;i++) {
			arrayInt[i] = i+1;
		}
		
		//�迭������[�ε���]=��;
		arrayInt[3]=10;
//		System.out.println(arrayInt[3]);
		arrayInt[6]=20;
//		System.out.println(arrayInt[3]);
		//---- ��� ---- 
		for(i=0;i<=6;i++) {
			System.out.println(i+" : "+arrayInt[i]);
		}
	}

}
