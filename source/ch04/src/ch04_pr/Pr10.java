package ch04_pr;

import java.util.Scanner;

public class Pr10 {

	public static void main(String[] args) {
		//1. while 무한루프
		int num =0, sum=0, count=0;
		double avg=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			//2. 숫자 입력
			num = sc.nextInt();
			//3. 합계
			sum+=num;
			//4. 몇개가 더해 졌는지 카운팅
			count++;
			//5. 100이상 이상이면 break;
			if(num>=100) {
				break;
			}			
		}
		System.out.println(sum);
		//A. sum -> double, B. count -> double, C 결과가 -> avg
		avg=(double)sum/count;
		System.out.println(avg);
		System.out.println("end");
		

	}

}
