package ch04_pr;

import java.util.Scanner;

public class Pr5 {

	public static void main(String[] args) {
		//1. ���� ���� �Է�
		int age = 0;
		String gender=null;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		gender = sc.next();
		System.out.println(age+", "+gender);
		//2. ����, ����

		// M -> true || false -> true 	
		//m -> false || true -> true
		//f -> false || false -> false
		if(gender.equals("M") || gender.equals("m") ){//����
			if(age>=18) {//����
				System.out.println("���γ���");
			}
			else {//�̼���
				System.out.println("�̼��Ⳳ��");
			}
		}
		else if(gender.equals("F") || gender.equals("f")){//����
			if(age>=18) {//����
				System.out.println("���ο���");
			}
			else {//�̼���
				System.out.println("�̼��⿩��");
			}	
		}
		else {
			System.out.println("����");
		}
		
		
		
				
	}

}
