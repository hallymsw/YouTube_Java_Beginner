package ch05_pr;

import java.util.Scanner;

public class Pr8 {

	public static void main(String[] args) {
		int count=0, i=0, num=0;
		Scanner sc = new Scanner(System.in);
		//1. 100�� ������ ���� �迭�� �����
		int[] numArr = new int[100];
		
		//2. �ݺ����� ���ؼ� Ű����κ��� �Է�
		for(i=0;i<=99;i++) {
			num=sc.nextInt();
			//3. 0 �ΰ�� -> �ݺ����� ����
			if(num==0) {
				break;
			}
			//4. �迭�� ����
			numArr[i]=num;
			//5. ī���� ���� ����
			count++;

		}
		System.out.println(count);// 5 -> 0 1 2 3 4 
		//6. �ݺ����� �̿� �迭 �� ������ ��������
		for(i=0;i<=count-1;i++) {
			num =numArr[i];
			//7. Ȧ�� �ΰ�� 
			if(num%2!=0) {
				//8. ���� �ι� �ؼ� ���
				System.out.println(num*2);
			}
			else {		//9. ¦���ΰ���
				//10.2�� �������� ���	
				System.out.println(num/2);
				
			}

 

			
		}
		 	
			 

	}
	

}
