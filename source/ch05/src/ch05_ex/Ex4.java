package ch05_ex;

public class Ex4 {

	public static void main(String[] args) {
		int[] score= {82, 81,70, 100,90, 80, 68};
		//             0   1  2   3  4    5
		int i=0;
		int sum=0;
		double avg=0;
		int len = score.length; // -> 6
		System.out.println(len);
		for(i=0;i<=score.length-1;i++) {// 0-4
			System.out.println(i+" : "+score[i]);
			sum=sum+score[i];
		}
		System.out.println("sum : "+sum);
		avg=(double)sum/score.length;
		System.out.println("sum : "+avg);
	}

}
