package ch05_pr;

import java.util.Scanner;

public class Pr1 {

	public static void main(String[] args) {
		//1. 배열 변수에 1-6반까지 평균 점수를 저장
		//배열변수 선언 형식
		//데이터타입[] 변수명={};
		double[] scores= {85.6, 79.5, 83.1, 80, 78.2, 75};
		//2. 두반의 번호를 입력받고 
		Scanner sc = new Scanner(System.in);
		int cls1= sc.nextInt();
		int cls2= sc.nextInt();
		//value 85.6, 79.5, 83.1, 80, 78.2, 75
		//index    0   1     2     3   4     5  
		//class    1   2     3     4   5      6
		//index =class -1;
		//3. 2번을  인덱스로 삼아서 -> 값을 가져옴
		int index1 =cls1-1;//1 -> 0
		int index2 =cls2-1;//3 -> 2
		
//		System.out.println(index1+", "+index2);
		//4. 3번을 통해 얻은 평균 점수를 합하고
		//변수 = 배열변수[인덱스];
		double s1 =scores[index1];//85.6
		double s2 =scores[index2];//83.1
		
		double sum = s1+s2;
		//5. 4번의 결과를 출력
		System.out.println(sum);
	}

}
