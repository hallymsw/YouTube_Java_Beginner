package ch05_pr;

public class Pr1_3 {

	public static void main(String[] args) {
		int i=0;
		
			//1-2 �迭������ �����ϸ鼭 �����͸� ������ ������ Ȯ��
		int[] arrayInt = new int[7];
		//value : 0 0 0 0 0 0 0 
		//index : 0 1 2 3 4 5 6 
		for(i=0;i<=6;i++) {
			arrayInt[i] = i+1;
		}
		//value : 1 2 3 4 5 6 7 
		//index : 0 1 2 3 4 5 6 
		
//		0,2,4,6 �ε����� ������ ����Ͻÿ�
//		�迭�� 0,3,6 �ε����� ������ ����Ͻÿ�



		//---- ��� ---- 
//		for(i=0;i<=6;i++) {
//			System.out.println(i+" : "+arrayInt[i]);
//		}
	}

}
