package ch04_pr;
import java.util.Scanner;

public class Pr13 {
	public static void main(String[] args) {
		int num=0, count=0;
		Scanner sc = new Scanner(System.in);
		
		//1. while �� ���ѷ��� �����
		while(true) {
			//2. �����Է�
			num = sc.nextInt();
			//3. 0 �ԷµǸ� ����Ǵ� ���ǹ�
			if(num ==0) {
				break;
			}
			//4. 3�� ��� 5�� ��� �ƴѰ͵� ���͸��ϴ� ���ǹ�	
			if(!(num % 3 ==0 || num % 5 ==0)) {
				//5. 4���� �ش��ϴ°͵� ī����
				count++;
			}
				
		}
		//6. ���
		System.out.println(count);

		
	
	}
	
}
