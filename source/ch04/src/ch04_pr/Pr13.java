package ch04_pr;
import java.util.Scanner;

public class Pr13 {
	public static void main(String[] args) {
		int num=0, count=0;
		Scanner sc = new Scanner(System.in);
		
		//1. while 로 무한루프 만들기
		while(true) {
			//2. 숫자입력
			num = sc.nextInt();
			//3. 0 입력되면 종료되는 조건문
			if(num ==0) {
				break;
			}
			//4. 3의 배수 5의 배수 아닌것들 필터링하는 조건문	
			if(!(num % 3 ==0 || num % 5 ==0)) {
				//5. 4번에 해당하는것들 카운팅
				count++;
			}
				
		}
		//6. 출력
		System.out.println(count);

		
	
	}
	
}
