package ch04_pr;

import java.util.Scanner;

public class Pr11 {

	public static void main(String[] args) {
		//1. ���ѷ��� while
		int num =0,ec=0, oc=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			//2. ���� �Է�
			num = sc.nextInt();
			//3. �ݺ��� ���� �˻�
			if(num ==0)// 0 ==0 -> true
			{
				break;
			}
			//4. 0�� �ƴϸ� Ȧ�� ���� ¦�� ���� �Ǻ� ī��Ʈ
			
			if(num % 2 ==0) {//¦�� 4�� 2�� ������ ��2 ������0
				ec++;
			}
			else {
				oc++;
			}
		}			
		//5. Ȧ�� ¦�� ������ ���
		System.out.println(ec+", "+oc);
	}

}
