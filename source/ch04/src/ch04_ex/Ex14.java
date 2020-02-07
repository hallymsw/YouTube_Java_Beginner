package ch04_ex;

public class Ex14 {

	public static void main(String[] args) {

		int i=0, sum=0, count=0;
		double avg=0;
		for(i=1;i<=10;i++){
			sum+=i;
			count++;
		}
		avg = (double)sum/count;
		System.out.println(avg);


	}

}
