package ch05_pr;

import java.util.Scanner;

public class Pr2 {

	public static void main(String[] args) {
		int i=0, sum1=0, sum2=0, count=0, num=0;
		Scanner sc = new Scanner(System.in);
		double avg=0;
		//배열변수 선언 - 공간마련
		//데이터타입[] 변수명 = new 데이터타입[공간갯수];
		int[] numArr = new int[10];//0-9
		//1. 반복문을 이용해서 10개정수 를 입력받는거고
		for(i=0;i<=9;i++) {//0-9
			//2. 배열에 저장
			num=sc.nextInt();
			numArr[i]=num;
		}
			
			
		//3. 반복문을 통해 배열에서 데이터를 꺼냄 
		for(i=0;i<=9;i++) {
			num=numArr[i];
			//4. 조건문에서 짝수번인지 홀수 인지 판별
			// value : 95 100 88 65 76 89 58 93 77 99
			// index : 0   1   2  3  4  5  6  7  8  9
			// 순서 :    o   e   o  e  o  e o   e  o  e
			// -> 인덱스 홀수 -> 짝수 번째

			if(i%2==0){			//4-1 홀수번째 -> 누접합2, 더해진 갯수 카운팅
				sum2=sum2+num;
				count++;	
			}
			else {			//4-2 짝수번째 -> 누적합1
				sum1=sum1+num;
			}
		}
		System.out.println(sum1);	
		avg = (double)sum2/count;
		System.out.println(avg);
		//5. 합과 평균 출력
		//---- 배열출력 ----
//		for(i=0;i<=9;i++) {//0-9
//			System.out.println(numArr[i]);
//			
//		}
		
	
	}

}
