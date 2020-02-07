package ch05_pr;

import java.util.Scanner;

public class Pr8 {

	public static void main(String[] args) {
		int count=0, i=0, num=0;
		Scanner sc = new Scanner(System.in);
		//1. 100개 데이터 저장 배열을 만들고
		int[] numArr = new int[100];
		
		//2. 반복문을 통해서 키보드로부터 입력
		for(i=0;i<=99;i++) {
			num=sc.nextInt();
			//3. 0 인경우 -> 반복문을 종료
			if(num==0) {
				break;
			}
			//4. 배열에 저장
			numArr[i]=num;
			//5. 카운팅 변수 증가
			count++;

		}
		System.out.println(count);// 5 -> 0 1 2 3 4 
		//6. 반복문을 이용 배열 의 값들을 꺼내오기
		for(i=0;i<=count-1;i++) {
			num =numArr[i];
			//7. 홀수 인경우 
			if(num%2!=0) {
				//8. 값을 두배 해서 출력
				System.out.println(num*2);
			}
			else {		//9. 짝수인경우는
				//10.2로 나눈값을 출력	
				System.out.println(num/2);
				
			}

 

			
		}
		 	
			 

	}
	

}
