package ch04_pr;

import java.util.Scanner;

public class Pr6 {

	public static void main(String[] args) {
		//1. ���� �빮�� �Է� -> next()
		String str = null;
		Scanner sc = new Scanner(System.in);
		str=sc.next();
		System.out.println(str);
		//2. ���ǹ��� �̿� �빮�� �Ǻ�
		//3. �� ���ں� ���ڿ� ���
		if(str.equals("A")) {
			System.out.println("Excellent");
		}
		else if(str.equals("B")) {
			System.out.println("Good");
		}
		else if(str.equals("C")) {
			System.out.println("Usually");
		}
		else if(str.equals("D")) {
			System.out.println("Effor");
		}
		else if(str.equals("E")) {
			System.out.println("Excellent");
		}
		else if(str.equals("F")) {
			System.out.println("failure");
		}
		else {
			System.out.println("Error");
		}
	}

}
