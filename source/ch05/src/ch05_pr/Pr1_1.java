package ch05_pr;

public class Pr1_1 {

	public static void main(String[] args) {
		int i=0;
		//1. �迭���� ���� ���
			//1-1 �ʱⰪ�� �ָ鼭 �迭�� ������
		//int[] arrayInt = {1,2,3,4,5,6,7};
		//                  0 1 2 3 4 5 6
			//1-2 �迭������ �����ϸ鼭 �����͸� ������ ������ Ȯ��
		int[] arrayInt = new int[7];
		//value : 0 0 0 0 0 0 0 
		//index : 0 1 2 3 4 5 6 
		for(i=0;i<=6;i++) {
			arrayInt[i] = i+1;
		}
		
		int temp = arrayInt[0];
		System.out.println(temp);
		temp = arrayInt[5];
		System.out.println(temp);
		//---- ��� ---- 
//		for(i=0;i<=6;i++) {
//			System.out.println(i+" : "+arrayInt[i]);
//		}
	}

}
