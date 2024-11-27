package javaDemo;

public class If_Else {

	public static void main(String[] args) {


		//If - the condition is true than the block of code will execute

		if(20 < 18) { //if the condition is true code will execute
			System.out.println("20 is grater than 18");  


		}

		else  { // If the same condition is false, else block will execute
			System.out.println("I am lovely");
		}

		int x = 20;
		int y = 18;
		//Scenario - 1
		if(x > y) {
			System.out.println("X grater than Y");
		}
		else {
			System.out.println("X less than Y");
		}
		//Scenario -2
		if(x < y) {
			System.out.println("X less than y");
		}
		else {
			System.out.println("X grater than Y");

		}   
	}

}


