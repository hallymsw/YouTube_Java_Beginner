package ch05_pr;

import java.util.Scanner;

public class Pr1 {

	public static void main(String[] args) {
		//1. �迭 ������ 1-6�ݱ��� ��� ������ ����
		//�迭���� ���� ����
		//������Ÿ��[] ������={};
		double[] scores= {85.6, 79.5, 83.1, 80, 78.2, 75};
		//2. �ι��� ��ȣ�� �Է¹ް� 
		Scanner sc = new Scanner(System.in);
		int cls1= sc.nextInt();
		int cls2= sc.nextInt();
		//value 85.6, 79.5, 83.1, 80, 78.2, 75
		//index    0   1     2     3   4     5  
		//class    1   2     3     4   5      6
		//index =class -1;
		//3. 2����  �ε����� ��Ƽ� -> ���� ������
		int index1 =cls1-1;//1 -> 0
		int index2 =cls2-1;//3 -> 2
		
//		System.out.println(index1+", "+index2);
		//4. 3���� ���� ���� ��� ������ ���ϰ�
		//���� = �迭����[�ε���];
		double s1 =scores[index1];//85.6
		double s2 =scores[index2];//83.1
		
		double sum = s1+s2;
		//5. 4���� ����� ���
		System.out.println(sum);
	}

}
