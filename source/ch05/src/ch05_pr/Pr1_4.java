package ch05_pr;

public class Pr1_4 {

	public static void main(String[] args) {
		int i=0;
		
			//1-2 배열변수를 선언하면서 데이터를 저장할 공간을 확보
		int[] arrayInt = new int[7];
		//value : 0 0 0 0 0 0 0 
		//index : 0 1 2 3 4 5 6 
		for(i=0;i<=6;i++) {
			arrayInt[i] = i+1;
		}
//		배열의 0-5번째 인덱스 값들을 출력하시오
		for(i=0;i<=5;i++) {//4 -> t, 5 - t, 6 ->f
			System.out.println(i+ " : "+arrayInt[i]);
		}

		//---- 출력 ---- 
//		for(i=0;i<=6;i++) {
//			System.out.println(i+" : "+arrayInt[i]);
//		}
	}

}
