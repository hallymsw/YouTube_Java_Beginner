package ch04_pr;

import java.util.Scanner;

public class Pr1 {

	public static void main(String[] args) {
		
		//1. ���� �Է�
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//2. �Է¹��� ���� ���
		System.out.println("�Է¹��� ��� : "+num);
		//3. if���� �̿� ������ ���� minus���
		//if(���ǽ�){
		//		}
		if(num < 0) {
			System.out.println("minus");
		}
		
	}

}
