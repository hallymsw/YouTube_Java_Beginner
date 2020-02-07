package ch04_pr;

import java.util.Scanner;

public class Pr7 {

	public static void main(String[] args) {
		int num =0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num==0) {
			System.out.println("zero");
		}
		else if(num >0)
		{
			System.out.println("plus");
		}
		else {
			System.out.println("minus");
		}
	}

}
