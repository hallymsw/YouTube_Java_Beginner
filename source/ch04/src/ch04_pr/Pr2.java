package ch04_pr;

import java.util.Scanner;

public class Pr2 {

	public static void main(String[] args) {
		//1. Ű�� �����Ը� �ڿ����� �Է� �޴´�.
		int height=0, wieght=0;
		Scanner sc = new Scanner(System.in);
		height = sc.nextInt();
		wieght = sc.nextInt();
		System.out.println(height+", "+wieght);
		//2. �񸸼�ġ ��� - ������+100-Ű
		int formula = wieght+100-height;
		System.out.println(formula);
		//3. ���ǹ��� �̿��ؼ� �񸸼�ġ>0 -> ���̶�� ���
		if(formula>0) {
			System.out.println("Obesity");
		}
		
		
	}

}
