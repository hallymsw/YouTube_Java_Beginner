package ch04_ex;

public class While {

	public static void main(String[] args) {
		// 1부터 10까지의 수중 홀수만 출력
		int i=1;
		while(i<=10) {
			if(i%2==0) {//짝수면 true
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}

		
	
	}

}
