package ch05_pr;

import java.util.Scanner;

public class Pr7 {

	public static void main(String[] args) {
		//1, 정수배열 100개 생성
		int[] numArr = new int[100];
		int i=0, sum=0, count=0, num=0, resCount=0;
		double avg=0;
		Scanner sc = new Scanner(System.in);
		//2. 반복문으로 정수 입력
		for(i=0;i<=99;i++) {
			num= sc.nextInt();
			//3. 조건문 : 0이 입력되면 반복문종료
			if(num==0) {
				break;
			}
			
			//4. 배열 저장
			numArr[i]=num;
			//8. 더해진 갯수 카운트
			count++;
			
		}
		//5. 반복문 배열에 저장된 값을 가져 오기
		for(i=0;i<=count-1;i++) {
			num = numArr[i];
			//6 조건문을 이용해서 5의 배수인지 판별
			if(num %5==0) {
				sum+=num;
				resCount++;
			}
			
			//7. 누적합에 더하고

		}

		// 누적합하고, 평균 출력
		System.out.println(resCount);
		System.out.println(sum);
		avg = (double)sum/resCount;
		System.out.println(avg);
	}
	

}
