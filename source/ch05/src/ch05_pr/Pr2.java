package ch05_pr;

import java.util.Scanner;

public class Pr2 {

	public static void main(String[] args) {
		int i=0, sum1=0, sum2=0, count=0, num=0;
		Scanner sc = new Scanner(System.in);
		double avg=0;
		//�迭���� ���� - ��������
		//������Ÿ��[] ������ = new ������Ÿ��[��������];
		int[] numArr = new int[10];//0-9
		//1. �ݺ����� �̿��ؼ� 10������ �� �Է¹޴°Ű�
		for(i=0;i<=9;i++) {//0-9
			//2. �迭�� ����
			num=sc.nextInt();
			numArr[i]=num;
		}
			
			
		//3. �ݺ����� ���� �迭���� �����͸� ���� 
		for(i=0;i<=9;i++) {
			num=numArr[i];
			//4. ���ǹ����� ¦�������� Ȧ�� ���� �Ǻ�
			// value : 95 100 88 65 76 89 58 93 77 99
			// index : 0   1   2  3  4  5  6  7  8  9
			// ���� :    o   e   o  e  o  e o   e  o  e
			// -> �ε��� Ȧ�� -> ¦�� ��°

			if(i%2==0){			//4-1 Ȧ����° -> ������2, ������ ���� ī����
				sum2=sum2+num;
				count++;	
			}
			else {			//4-2 ¦����° -> ������1
				sum1=sum1+num;
			}
		}
		System.out.println(sum1);	
		avg = (double)sum2/count;
		System.out.println(avg);
		//5. �հ� ��� ���
		//---- �迭��� ----
//		for(i=0;i<=9;i++) {//0-9
//			System.out.println(numArr[i]);
//			
//		}
		
	
	}

}
