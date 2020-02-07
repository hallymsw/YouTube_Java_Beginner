package ch04_pr;

import java.util.Scanner;

public class Pr2 {

	public static void main(String[] args) {
		//1. 키와 몸무게를 자연수로 입력 받는다.
		int height=0, wieght=0;
		Scanner sc = new Scanner(System.in);
		height = sc.nextInt();
		wieght = sc.nextInt();
		System.out.println(height+", "+wieght);
		//2. 비만수치 출력 - 몸무게+100-키
		int formula = wieght+100-height;
		System.out.println(formula);
		//3. 조건문을 이용해서 비만수치>0 -> 비만이라고 출력
		if(formula>0) {
			System.out.println("Obesity");
		}
		
		
	}

}
