package ch05_pr;

import java.util.Scanner;

public class Pr4 {

	public static void main(String[] args) {
		//1. ���� 10������ �迭 ����
		int[] numArr = new int[10];
		int i=0, num=0, oddSum=0, evenSum=0;
		Scanner sc = new Scanner(System.in);
		//2. �ݺ����� ���ؼ� 10�� �迭�� ����
		for(i=0;i<=9;i++) {
//			System.out.println(i);
			num = sc.nextInt();
			numArr[i]=num;
		}
		//3. �ݺ��� �迭��Ҹ� ������ 
		for(i=0;i<=9;i++) {
			//val : 10 20 25 66 83 7 22 90 1 100
			//index: 0  1 2   3 4  5  6  7 8  9
			//���� :   1  2 3  4  5  6 7  8  9  10 
 			//4. ���ǹ� ���� �Ǵ�
			if(i % 2==0) {
				// 5.Ȧ����° ������ i % 2==0
				oddSum+=numArr[i];
			}
			else {
				// 5. ¦����° ������
				evenSum+=numArr[i];
			}
				

		
		}
			
		//6. ������ ��� 
		System.out.println("Ȧ����° ��"+oddSum);
		System.out.println("¦����° ��"+evenSum);
		//-------------------
//		for(i=0;i<=9;i++) {
//			System.out.println(numArr[i]);
//		}
	}
	

}
