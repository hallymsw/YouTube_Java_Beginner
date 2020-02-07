package ch05_pr;

import java.util.Scanner;

public class Pr4 {

	public static void main(String[] args) {
		//1. 정수 10개저장 배열 생성
		int[] numArr = new int[10];
		int i=0, num=0, oddSum=0, evenSum=0;
		Scanner sc = new Scanner(System.in);
		//2. 반복문을 통해서 10개 배열에 저장
		for(i=0;i<=9;i++) {
//			System.out.println(i);
			num = sc.nextInt();
			numArr[i]=num;
		}
		//3. 반복문 배열요소를 꺼내서 
		for(i=0;i<=9;i++) {
			//val : 10 20 25 66 83 7 22 90 1 100
			//index: 0  1 2   3 4  5  6  7 8  9
			//순서 :   1  2 3  4  5  6 7  8  9  10 
 			//4. 조건문 순서 판단
			if(i % 2==0) {
				// 5.홀수번째 누적합 i % 2==0
				oddSum+=numArr[i];
			}
			else {
				// 5. 짝수번째 누적합
				evenSum+=numArr[i];
			}
				

		
		}
			
		//6. 누적합 출력 
		System.out.println("홀수번째 합"+oddSum);
		System.out.println("짝수번째 합"+evenSum);
		//-------------------
//		for(i=0;i<=9;i++) {
//			System.out.println(numArr[i]);
//		}
	}
	

}
