package ch04_pr;

import java.util.Scanner;

public class Pr12 {

	public static void main(String[] args) {

		int num =0, sum =0, count=0;
		double avg=0;
		Scanner sc = new Scanner(System.in);
		//1. 무한 루프로 계속 입력받는 구조를 만든다.
		while(true) {
			//2. 숫자를 입력 받는데
			num = sc.nextInt();
			//3. 반복문 종료 조건문
			if(num<0 || num >100){
				break;
			}
			//4. 합계, 갯수 카운팅
			if(num  >=0 && num <=100){
				sum+=num;
				//sum = sum+num;
				count++;
			}
		}
		
		//5. 평균 구하기
		avg= (double)sum/count;
		//6. 합계 평균 출력
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
	}

}
