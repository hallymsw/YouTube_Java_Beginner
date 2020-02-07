package ch05_pr;

import java.util.Scanner;

public class Pr6 {

	public static void main(String[] args) {
		//1. 실수 배열 - 6
		double[] wArr = new double[6];
		int i=0;
		double wSum=0;
		double wNum=0;
		Scanner sc = new Scanner(System.in);
		//2. 반복문 -> 몸무게 값 저장
		for(i=0;i<=5;i++) {
			wNum=sc.nextDouble();
			wArr[i]=wNum;
		}
		for(i=0;i<=5;i++) {
			//3. 반복문 -> 몸무게 값을 가져오고
			wNum=wArr[i];
			//4. 누적합에 더하고
			wSum+=wNum;
			
		}
		//5. 누적합 출력
		System.out.println(wSum/6);
	}
	

}
