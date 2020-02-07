package ch05_ex;

public class Ex1 {

	public static void main(String[] args) {
		int[] arrInt= {1,2,3,4,5};
		//             0 1 2 3 4
		int num1=10;
		int num2=20;
		//value : {10,2,3,4,20}
		//index :   0 1 2 3 4
		arrInt[0]=num1;
		arrInt[4]=num2;
		
		System.out.println(arrInt[0]+", "+arrInt[4]);
	}

}
