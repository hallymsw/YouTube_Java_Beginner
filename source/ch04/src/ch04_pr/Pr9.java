package ch04_pr;

import java.util.Scanner;

public class Pr9 {

	public static void main(String[] args) {



		//1-2-3는 반복문 안에 위치
		int num =0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			//1. 정수 받고
			num = sc.nextInt();

			//3. 0 -종료(반복문을 종료)
			//0 == 0 -> true
			if(num ==0 ) {
				break;
			}
			
			//2. 양수-> p, 음수-> n			
			if(num>0) {
				System.out.println("positive");	
			}
			else {
				System.out.println("negative");
			}
			
	
			
		}
		System.out.println("end");
	}

}
