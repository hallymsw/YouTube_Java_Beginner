package ch04_pr;

import java.util.Scanner;

public class Pr9 {

	public static void main(String[] args) {



		//1-2-3�� �ݺ��� �ȿ� ��ġ
		int num =0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			//1. ���� �ް�
			num = sc.nextInt();

			//3. 0 -����(�ݺ����� ����)
			//0 == 0 -> true
			if(num ==0 ) {
				break;
			}
			
			//2. ���-> p, ����-> n			
			if(num>0) {
				System.out.println("positive");	
			}
			else {
				System.out.println("negative");
			}
			
	
			
		}
		System.out.println("end");
	}

}
