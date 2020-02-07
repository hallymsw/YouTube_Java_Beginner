package ch04_pr;

import java.util.Scanner;

public class Pr6 {

	public static void main(String[] args) {
		//1. 영문 대문자 입력 -> next()
		String str = null;
		Scanner sc = new Scanner(System.in);
		str=sc.next();
		System.out.println(str);
		//2. 조건문을 이용 대문자 판별
		//3. 각 문자별 문자열 출력
		if(str.equals("A")) {
			System.out.println("Excellent");
		}
		else if(str.equals("B")) {
			System.out.println("Good");
		}
		else if(str.equals("C")) {
			System.out.println("Usually");
		}
		else if(str.equals("D")) {
			System.out.println("Effor");
		}
		else if(str.equals("E")) {
			System.out.println("Excellent");
		}
		else if(str.equals("F")) {
			System.out.println("failure");
		}
		else {
			System.out.println("Error");
		}
	}

}
