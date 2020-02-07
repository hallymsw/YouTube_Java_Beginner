package ch05_pr;

public class Pr1_1 {

	public static void main(String[] args) {
		int i=0;
		//1. 배열변수 선언 방법
			//1-1 초기값을 주면서 배열을 선언방법
		//int[] arrayInt = {1,2,3,4,5,6,7};
		//                  0 1 2 3 4 5 6
			//1-2 배열변수를 선언하면서 데이터를 저장할 공간을 확보
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
		//---- 출력 ---- 
//		for(i=0;i<=6;i++) {
//			System.out.println(i+" : "+arrayInt[i]);
//		}
	}

}
