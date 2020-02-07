package ch05_pr;

public class Pr1_6 {

	public static void main(String[] args) {
		int i=0;		
			//1-2 배열변수를 선언하면서 데이터를 저장할 공간을 확보
		int[] arrayInt = new int[7];
		//value : 0 0 0 0 0 0 0 
		//index : 0 1 2 3 4 5 6 
		for(i=0;i<=6;i++) {
			arrayInt[i] = i+1;
		}
		//value : 1 2 3 4 5 6 7 
		//index : 0 1 2 3 4 5 6 
		//5-3 : 5, 4, 3
		for(i=5;i>=3;i--) {//5 >=3 t, 4>=3 -> t, 3>=3 -> , 2>=3 -> f
			System.out.println(i+" : "+arrayInt[i]);
		}

	
		//---- 출력 ---- 
//		for(i=0;i<=6;i++) {
//			System.out.println(i+" : "+arrayInt[i]);
//		}
	}

}
