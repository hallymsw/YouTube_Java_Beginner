package ch04_pr;

import java.util.Scanner;

public class Pr3 {

	public static void main(String[] args) {
		//1. 나이입력 받기
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int gap=0;
//		System.out.println(age);
		
		//2. 조건문   if - else
		//2-1. 20살 이상인경우, 
		if(age>=20) {
			System.out.println("adult");
		}
		else {
			//2-2 20살 미만인 경우
			//20살에서 현재 나이를 빼고  결과값을 출력
			gap=20-age;
			System.out.println(gap+"years later");
		}
		
		
		
	}

}
