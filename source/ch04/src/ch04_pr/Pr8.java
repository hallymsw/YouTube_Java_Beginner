package ch04_pr;

import java.util.Scanner;

public class Pr8 {

	public static void main(String[] args) {
		//1. �Ǽ��� �Է¹޴´�.
		double score =0;
		Scanner sc = new Scanner(System.in);
		score = sc.nextDouble();
		System.out.println(score);
		//2. ���ǹ����� ������ �˻��ؼ� �ش� ���ڿ��� ���
		if(score>= 4.0) {
			System.out.println("scholarship");
		}
		else if(score>= 3.0) {
			System.out.println("next semester");
		}
		else if(score>= 2.0) {
			System.out.println("seasonal semester");
		}
		else {
			System.out.println("retake");
		}
	}

}
