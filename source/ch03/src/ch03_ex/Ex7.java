package ch03_ex;

public class Ex7 {

	public static void main(String[] args) {
		int num=11;
		System.out.println((num>=10)&&(num<=122));
		//                   10>=10     10<=122
		//                      true     true -> true
		num=9;
		System.out.println((num>=10)&&(num<=122));
		//                   9>=10     9<=122
		//                      false     true -> false
	
		num=9;
		System.out.println((num>=10)||(num<=122));
		//                   9>=10     9<=122
		//                      false     true -> true

	}

}
