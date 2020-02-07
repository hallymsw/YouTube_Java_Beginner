package ch06.exam05_package.hy;

public class Car {
	//필드
	public String company = "h_motor";
	public String model;
	public String color;

	//생성자
	public Car() {
	}
	public  Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public String getCompany() {
		return this.company;
	}
}
