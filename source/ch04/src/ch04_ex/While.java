package ch04_ex;

public class While {

	public static void main(String[] args) {
		// 1���� 10������ ���� Ȧ���� ���
		int i=1;
		while(i<=10) {
			if(i%2==0) {//¦���� true
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}

		
	
	}

}
