package ch04_pr;

import java.util.Scanner;

public class Pr10 {

	public static void main(String[] args) {
		//1. while ���ѷ���
		int num =0, sum=0, count=0;
		double avg=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			//2. ���� �Է�
			num = sc.nextInt();
			//3. �հ�
			sum+=num;
			//4. ��� ���� ������ ī����
			count++;
			//5. 100�̻� �̻��̸� break;
			if(num>=100) {
				break;
			}			
		}
		System.out.println(sum);
		//A. sum -> double, B. count -> double, C ����� -> avg
		avg=(double)sum/count;
		System.out.println(avg);
		System.out.println("end");
		

	}

}
