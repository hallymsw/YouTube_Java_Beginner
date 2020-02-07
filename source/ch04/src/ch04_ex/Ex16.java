package ch04_ex;

public class Ex16 {

	public static void main(String[] args) {
		int i=0, sum=0;
		double avg=0;
		for(i=3;i<=10;i+=3){
			if(i%3==0) {
				sum+=i;	
			}
		}
		
		System.out.println(sum);

	}

}
