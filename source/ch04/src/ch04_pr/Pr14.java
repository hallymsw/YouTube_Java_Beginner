package ch04_pr;
import java.util.Scanner;

public class Pr14 {
	public static void main(String[] args) {
		//1. ���� �Է� �ޱ�
		int num =0, sum=0, i=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		//2. �ݺ��� 1~�Է¹��� ��������
		for(i=0;i<=num;i+=5) {
			System.out.println(i);
			//4. �����տ� ���ϱ�
			sum=sum+i;			
		}
		//5. ���� ���
		System.out.println(sum);	
		

		
	
	}
	
}
