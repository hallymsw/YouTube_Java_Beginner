package ch06.exam03_2_parameter_constructor;

public class CarExample {
	public static void main(String[] args)
	{		
		Car cno = new Car();
		System.out.println(cno.color);
		System.out.println(cno.cc);
		
		Car c = new Car("black",2000);
		System.out.println(c.color);
		System.out.println(c.cc);
	}
}
