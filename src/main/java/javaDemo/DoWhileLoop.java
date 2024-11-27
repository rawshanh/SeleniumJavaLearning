package javaDemo;

public class DoWhileLoop {

	public static void main(String[] args) {

//Do while loop execute at least one time, if the condition is false
		int i =1; //start
		do {
			System.out.println(i);
			i++; //increment
		}
		while(i<=0); //condition false here
		
		//Condition true, it will execute 10 times
		int j =1; //start
		do {
			System.out.println(j);
			j++; //increment
		}
		while(j<=10); //condition

	}

}
