package ch05_pr;

public class Pr1_5 {

	public static void main(String[] args) {
		int i=0;
		
			//1-2 �迭������ �����ϸ鼭 �����͸� ������ ������ Ȯ��
		int[] arrayInt = new int[7];
		//value : 0 0 0 0 0 0 0 
		//index : 0 1 2 3 4 5 6 
		for(i=0;i<=6;i++) {
			arrayInt[i] = i+1;
		}
//		0,2,4,6 �ε����� ������ ����Ͻÿ�
		
//		for(i=0;i<=6;i=i+2) {// i+=2
//			System.out.println(i+" : "+arrayInt[i]);
//		}
//		�迭�� 0,3,6 �ε����� ������ ����Ͻÿ�
		for(i=0;i<=6;i+=3) {//i=i+3
			System.out.println(i+" : "+arrayInt[i]);
		}

	
		//---- ��� ---- 
//		for(i=0;i<=6;i++) {
//			System.out.println(i+" : "+arrayInt[i]);
//		}
	}

}
