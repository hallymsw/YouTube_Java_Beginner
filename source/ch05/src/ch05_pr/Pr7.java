package ch05_pr;

import java.util.Scanner;

public class Pr7 {

	public static void main(String[] args) {
		//1, �����迭 100�� ����
		int[] numArr = new int[100];
		int i=0, sum=0, count=0, num=0, resCount=0;
		double avg=0;
		Scanner sc = new Scanner(System.in);
		//2. �ݺ������� ���� �Է�
		for(i=0;i<=99;i++) {
			num= sc.nextInt();
			//3. ���ǹ� : 0�� �ԷµǸ� �ݺ�������
			if(num==0) {
				break;
			}
			
			//4. �迭 ����
			numArr[i]=num;
			//8. ������ ���� ī��Ʈ
			count++;
			
		}
		//5. �ݺ��� �迭�� ����� ���� ���� ����
		for(i=0;i<=count-1;i++) {
			num = numArr[i];
			//6 ���ǹ��� �̿��ؼ� 5�� ������� �Ǻ�
			if(num %5==0) {
				sum+=num;
				resCount++;
			}
			
			//7. �����տ� ���ϰ�

		}

		// �������ϰ�, ��� ���
		System.out.println(resCount);
		System.out.println(sum);
		avg = (double)sum/resCount;
		System.out.println(avg);
	}
	

}
