package javaDemo;

public class ForLoop {

	public static void main(String[] args) {

		//For loop -print 0-20
		for(int i=0; i<=10; i=i+1) { //i=1, 1+1=2,2+1=3
			System.out.println(i);
		}
		System.out.println("**************************");
		
		//Print 2 to 20 all even number or print all even value from 2 to 20
		for (int i=2; i<= 10; i=i+2) {
			System.out.println(i);
		}
		System.out.println("**************************");
		//print all odd numbers from 0-10
		for(int i=1; i<=10; i=i+2) {
			System.out.println(i);
		}
	}

}
