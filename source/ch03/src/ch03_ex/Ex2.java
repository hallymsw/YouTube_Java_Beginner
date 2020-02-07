package ch03_ex;

public class Ex2 {
	public static void main(String[] args) {
		int sec=80;
		int sec60=60;
		int min = sec / sec60;
		System.out.println("min : "+min);
		
		int resSec = sec % sec60;
		System.out.println("second : "+resSec);
	}
}
