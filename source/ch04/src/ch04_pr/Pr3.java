package ch04_pr;

import java.util.Scanner;

public class Pr3 {

	public static void main(String[] args) {
		//1. �����Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int gap=0;
//		System.out.println(age);
		
		//2. ���ǹ�   if - else
		//2-1. 20�� �̻��ΰ��, 
		if(age>=20) {
			System.out.println("adult");
		}
		else {
			//2-2 20�� �̸��� ���
			//20�쿡�� ���� ���̸� ����  ������� ���
			gap=20-age;
			System.out.println(gap+"years later");
		}
		
		
		
	}

}
