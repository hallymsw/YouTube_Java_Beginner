package ch05_pr;

import java.util.Scanner;

public class Pr3 {

	public static void main(String[] args) {
		//1. �迭 ������ ����, 5���� �������
		int[] numArr = new int[5];
		int i=0, sum=0, num=0;
		Scanner sc = new Scanner(System.in);
		//2. �ݺ��� -> �����Է� 
		for(i=0;i<=4;i++) {
			num = sc.nextInt();
//			3. �迭 ����
			numArr[i]=num;
		}
			
		//4. �ݺ��� -> �迭 �ִ� ������ ��������
		for(i=0;i<=4;i++) {
			//15 20 33 10 9
			// 0  1  2  3  4
			//5. ���ǹ� ���� : 1,3,5 -> 0, 2, 4 => 2 f�� ������ ������ 0
			if(i%2==0) {
				//6.�������� ���ϰ�
				num=numArr[i];
				//System.out.println(num);
				sum+=num;
			}
		}
		
		///7. ���
		System.out.println(sum);
		
//		for(i=0;i<=4;i++) {
//			System.out.println(numArr[i]);
//		}
//
//	
	}

}
