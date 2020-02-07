package ch05_pr;

import java.util.Scanner;

public class Pr3 {

	public static void main(String[] args) {
		//1. 배열 변수를 선언, 5개의 저장공간
		int[] numArr = new int[5];
		int i=0, sum=0, num=0;
		Scanner sc = new Scanner(System.in);
		//2. 반복문 -> 숫자입력 
		for(i=0;i<=4;i++) {
			num = sc.nextInt();
//			3. 배열 저장
			numArr[i]=num;
		}
			
		//4. 반복문 -> 배열 있는 값들을 꺼내오고
		for(i=0;i<=4;i++) {
			//15 20 33 10 9
			// 0  1  2  3  4
			//5. 조건문 순서 : 1,3,5 -> 0, 2, 4 => 2 f로 나누면 나머지 0
			if(i%2==0) {
				//6.누접합을 구하고
				num=numArr[i];
				//System.out.println(num);
				sum+=num;
			}
		}
		
		///7. 출력
		System.out.println(sum);
		
//		for(i=0;i<=4;i++) {
//			System.out.println(numArr[i]);
//		}
//
//	
	}

}
