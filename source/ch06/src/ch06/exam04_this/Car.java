package ch06.exam04_this;

public class Car {
	String color="red";
	int cc=1100;
	public Car() {
		
	}
	public Car(String color, int cc) {
		this.color=color;
		this.cc=cc;
		String temp=this.getColor();
		System.out.println("temp : "+temp);
	}
	public String getColor() {
		return this.color;
	}
}

