package ch05_pr;

import java.util.Scanner;

public class Pr5 {

	public static void main(String[] args) {
		//1. 1oo 개 정수 배열 생성
		int[] numArr = new int[100];
		int i=0, count=0,startIndex=0, num=0;
		Scanner sc  = new Scanner(System.in);
		//2. 반복문을 통해서 정수 입력
		for(i=0;i<=99;i++) {
			num = sc.nextInt();
			//3. 입력된 정수가 -1 인지  아닌지 판별
			if(num==-1) {
//				System.out.println("break");
				break;
			}

			//4. -1이 아닌 경우 배열에 저장
			numArr[i]=num;
			//5. 카운트
			count++;
		}
//		System.out.println("end");
		//5. 배열에서 뒤에 세개만 꺼내서  순서대로 출력
		//count -> 5 , 시작 인덱스 -> 2 = count-3
		for(i=count-3;i<=count-1;i++) { //i : 0 -> count : 1 -> true, i:1 -> count:1 -> true
			System.out.println(i+" : "+numArr[i]);

		}
	}
	

}
