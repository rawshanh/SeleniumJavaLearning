package javaDemo;

public class ForEachloop {

	public static void main(String[] args) {

		//For each Loop
		int [] id = {10,20,30,40,50};
		/*for (int eachId : id) {
			System.out.println(eachId);
		}   */
		
		for (int i = 0; i < id.length; i++) {
			System.out.println(i);
			
		}
		
		
		System.out.println("********************************");
		
		//create an Array as names
		String [] names = {"Mamun","Limon","Jewel","Suhel","Arafat","Moon"};
		
		for (String eachNames : names) {
			System.out.println(eachNames);
		}
System.out.println("********************************");
		//Array creation way -2
		String [] emps =  new String [4];
		emps[0]= "Lovely";
		emps[1]= "Lavoni";
		emps[2]= "Nusrath";
		emps[3]= "Hussain";
		
		for (String eachEmp : emps) {
			System.out.println(eachEmp);
		}
		

	}

}
