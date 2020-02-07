package ch04_pr;

import java.util.Scanner;

public class Pr11 {

	public static void main(String[] args) {
		//1. 무한루프 while
		int num =0,ec=0, oc=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			//2. 정수 입력
			num = sc.nextInt();
			//3. 반복문 종료 검사
			if(num ==0)// 0 ==0 -> true
			{
				break;
			}
			//4. 0이 아니면 홀수 인지 짝수 인지 판별 카운트
			
			if(num % 2 ==0) {//짝수 4를 2로 나누면 몫2 나머지0
				ec++;
			}
			else {
				oc++;
			}
		}			
		//5. 홀수 짝수 갯수를 출력
		System.out.println(ec+", "+oc);
	}

}
