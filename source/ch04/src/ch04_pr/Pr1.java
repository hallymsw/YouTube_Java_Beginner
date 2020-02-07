package ch04_pr;

import java.util.Scanner;

public class Pr1 {

	public static void main(String[] args) {
		
		//1. 정수 입력
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//2. 입력받은 숫자 출력
		System.out.println("입력받은 출력 : "+num);
		//3. if문을 이용 음수인 경우면 minus출력
		//if(조건식){
		//		}
		if(num < 0) {
			System.out.println("minus");
		}
		
	}

}
