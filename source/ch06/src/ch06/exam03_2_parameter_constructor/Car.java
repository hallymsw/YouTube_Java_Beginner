package ch06.exam03_2_parameter_constructor;

public class Car {
	String color="red";
	int cc=1100;
	public Car() {
		System.out.println("Car()");
	}

	public Car(String color, int cc) {
		color=color;
		cc=cc;
		System.out.println("Car(2)");
	}
}

