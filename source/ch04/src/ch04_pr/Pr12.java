package ch04_pr;

import java.util.Scanner;

public class Pr12 {

	public static void main(String[] args) {

		int num =0, sum =0, count=0;
		double avg=0;
		Scanner sc = new Scanner(System.in);
		//1. ���� ������ ��� �Է¹޴� ������ �����.
		while(true) {
			//2. ���ڸ� �Է� �޴µ�
			num = sc.nextInt();
			//3. �ݺ��� ���� ���ǹ�
			if(num<0 || num >100){
				break;
			}
			//4. �հ�, ���� ī����
			if(num  >=0 && num <=100){
				sum+=num;
				//sum = sum+num;
				count++;
			}
		}
		
		//5. ��� ���ϱ�
		avg= (double)sum/count;
		//6. �հ� ��� ���
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
	}

}
