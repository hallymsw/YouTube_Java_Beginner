package ch04_pr;

import java.util.Scanner;

public class Pr4 {

	public static void main(String[] args) {
		//1. �ΰ��� ������ �Է� �޴´�.
		int n1=0, n2=0, val=0;
		int max=0, min=0;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		//2. ū���� �������� ����
		if(n1>n2) {
			max=n1;
			min=n2;
		}
		else {
			max=n2;
			min=n1;
		}
		//3. ū������ �������� ����.
		val = max-min;
		System.out.println(val);		
	}

}
