package ch04_pr;

import java.util.Scanner;

public class Pr8 {

	public static void main(String[] args) {
		//1. 실수를 입력받는다.
		double score =0;
		Scanner sc = new Scanner(System.in);
		score = sc.nextDouble();
		System.out.println(score);
		//2. 조건문에서 범위를 검사해서 해당 문자열을 출력
		if(score>= 4.0) {
			System.out.println("scholarship");
		}
		else if(score>= 3.0) {
			System.out.println("next semester");
		}
		else if(score>= 2.0) {
			System.out.println("seasonal semester");
		}
		else {
			System.out.println("retake");
		}
	}

}
