package ch05_pr;

import java.util.Scanner;

public class Pr5 {

	public static void main(String[] args) {
		//1. 1oo �� ���� �迭 ����
		int[] numArr = new int[100];
		int i=0, count=0,startIndex=0, num=0;
		Scanner sc  = new Scanner(System.in);
		//2. �ݺ����� ���ؼ� ���� �Է�
		for(i=0;i<=99;i++) {
			num = sc.nextInt();
			//3. �Էµ� ������ -1 ����  �ƴ��� �Ǻ�
			if(num==-1) {
//				System.out.println("break");
				break;
			}

			//4. -1�� �ƴ� ��� �迭�� ����
			numArr[i]=num;
			//5. ī��Ʈ
			count++;
		}
//		System.out.println("end");
		//5. �迭���� �ڿ� ������ ������  ������� ���
		//count -> 5 , ���� �ε��� -> 2 = count-3
		for(i=count-3;i<=count-1;i++) { //i : 0 -> count : 1 -> true, i:1 -> count:1 -> true
			System.out.println(i+" : "+numArr[i]);

		}
	}
	

}
