package ch05_pr;

public class Pr1_7 {

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
		for(i=6;i>=0;i--) { //1>0 - t, 0 >= 0 - t, -1 >=0 - f  
			System.out.println(i+" : "+arrayInt[i]);
		}

	
		//---- ��� ---- 
//		for(i=0;i<=6;i++) {
//			System.out.println(i+" : "+arrayInt[i]);
//		}
	}

}
