package javaDemo;

public class If_ElseIf_else {

	public static void main(String[] args) {

		//for multiple conditions we use else if
		int x = 20;
		//Scenario - 1
		if(x > 21) {
			System.out.println("X less than 21");	 
		}
		else if(x < 19) {
			System.out.println("x less than 19");
		}
		else if (x > 22) {
			System.out.println("x grater than 21");
		}
		else if( x > 24) {
			System.out.println(" x grater tahn 24");
		}
		else if (x > 19) {
			System.out.println("x grater than 19");
		}
		else {
			System.out.println("x equal to 20");
		}
		//scenario - 2
		String name = "Hussain";
		if(name.equals("Lovely")) {
			System.out.println("This is Hussain");
		}
		else if (name.equals("Lovely")) {
			System.out.println("This is lovely");
		}
		else {
			System.out.println("This guy is Hussain");
		}
	}

}
