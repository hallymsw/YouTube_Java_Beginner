package ch05_pr;

public class Pr1_2 {

	public static void main(String[] args) {
		int i=0;
		
			//1-2 배열변수를 선언하면서 데이터를 저장할 공간을 확보
		int[] arrayInt = new int[7];
		//value : 0 0 0 0 0 0 0 
		//index : 0 1 2 3 4 5 6 
		for(i=0;i<=6;i++) {
			arrayInt[i] = i+1;
		}
		
		//배열변수명[인덱스]=값;
		arrayInt[3]=10;
//		System.out.println(arrayInt[3]);
		arrayInt[6]=20;
//		System.out.println(arrayInt[3]);
		//---- 출력 ---- 
		for(i=0;i<=6;i++) {
			System.out.println(i+" : "+arrayInt[i]);
		}
	}

}
