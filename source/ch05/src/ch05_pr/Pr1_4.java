package ch05_pr;

public class Pr1_4 {

	public static void main(String[] args) {
		int i=0;
		
			//1-2 �迭������ �����ϸ鼭 �����͸� ������ ������ Ȯ��
		int[] arrayInt = new int[7];
		//value : 0 0 0 0 0 0 0 
		//index : 0 1 2 3 4 5 6 
		for(i=0;i<=6;i++) {
			arrayInt[i] = i+1;
		}
//		�迭�� 0-5��° �ε��� ������ ����Ͻÿ�
		for(i=0;i<=5;i++) {//4 -> t, 5 - t, 6 ->f
			System.out.println(i+ " : "+arrayInt[i]);
		}

		//---- ��� ---- 
//		for(i=0;i<=6;i++) {
//			System.out.println(i+" : "+arrayInt[i]);
//		}
	}

}
