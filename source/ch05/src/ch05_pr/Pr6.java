package ch05_pr;

import java.util.Scanner;

public class Pr6 {

	public static void main(String[] args) {
		//1. �Ǽ� �迭 - 6
		double[] wArr = new double[6];
		int i=0;
		double wSum=0;
		double wNum=0;
		Scanner sc = new Scanner(System.in);
		//2. �ݺ��� -> ������ �� ����
		for(i=0;i<=5;i++) {
			wNum=sc.nextDouble();
			wArr[i]=wNum;
		}
		for(i=0;i<=5;i++) {
			//3. �ݺ��� -> ������ ���� ��������
			wNum=wArr[i];
			//4. �����տ� ���ϰ�
			wSum+=wNum;
			
		}
		//5. ������ ���
		System.out.println(wSum/6);
	}
	

}
