package javaDemo;

public class Car {

	public static void main(String[] args) {

System.out.println("I am learning Selenium with Java");
carHorn();
carHorn();
addTwoString("Hussain ", "Rawshan");
//carDriving();

//Syntax of object creation
//ClassName object = new ClassName();
	Car obj = new Car();
	obj.carDriving();
	obj.carBreak();
	obj.carMirror();
	obj.carWheel();
	obj.carNum(50);

//Example of object of Human class- Human object = new Human();


	}
	public void carDriving() { //Non static
		System.out.println("I am from CarDriving");
	}
	private void carBreak() {
		System.out.println("I am from CarBreak");
	}
	
	protected void carWheel() {
		System.out.println("I am from CarWheel");
	}
	
	void carMirror() {
		System.out.println("I am from CarMirror");
	}
	
	public static void carHorn() { //Static
		System.out.println("I am from Car Horn");
	}
	
	public int carNum(int a) { //parameterize and non static method
		System.out.println(a);
		return a;
	}
	public static String addTwoString(String a, String b) { 
		System.out.println(a+b);
		return a+b;
		
	}
	
}
