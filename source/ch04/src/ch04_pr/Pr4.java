package ch04_pr;

import java.util.Scanner;

public class Pr4 {

	public static void main(String[] args) {
		//1. 두개의 정수를 입력 받는다.
		int n1=0, n2=0, val=0;
		int max=0, min=0;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		//2. 큰수와 작은수를 구분
		if(n1>n2) {
			max=n1;
			min=n2;
		}
		else {
			max=n2;
			min=n1;
		}
		//3. 큰수에서 작은수를 뺀다.
		val = max-min;
		System.out.println(val);		
	}

}
