package ch04_pr;

import java.util.Scanner;

public class Pr5 {

	public static void main(String[] args) {
		//1. 나이 성별 입력
		int age = 0;
		String gender=null;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		gender = sc.next();
		System.out.println(age+", "+gender);
		//2. 나이, 성별

		// M -> true || false -> true 	
		//m -> false || true -> true
		//f -> false || false -> false
		if(gender.equals("M") || gender.equals("m") ){//남자
			if(age>=18) {//성인
				System.out.println("성인남자");
			}
			else {//미성년
				System.out.println("미성년남자");
			}
		}
		else if(gender.equals("F") || gender.equals("f")){//여자
			if(age>=18) {//성인
				System.out.println("성인여자");
			}
			else {//미성년
				System.out.println("미성년여자");
			}	
		}
		else {
			System.out.println("에러");
		}
		
		
		
				
	}

}
