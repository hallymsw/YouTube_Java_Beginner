package ch04_pr;
import java.util.Scanner;

public class Pr14 {
	public static void main(String[] args) {
		//1. 정수 입력 받기
		int num =0, sum=0, i=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		//2. 반복문 1~입력받은 정수까지
		for(i=0;i<=num;i+=5) {
			System.out.println(i);
			//4. 누적합에 더하기
			sum=sum+i;			
		}
		//5. 합을 출력
		System.out.println(sum);	
		

		
	
	}
	
}
