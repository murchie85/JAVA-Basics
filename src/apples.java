// imports methods_instances method as an object

import java.util.Scanner;

public class apples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		oranges classAObject = new oranges();
		System.out.println("enter name of first girlfriend here: ");
		String temp = input.nextLine(); // takes above and stores in a temp var
		classAObject.setName(temp); // calls setname from our other class 
		classAObject.saying();
	}

}


/// SUMMARY 
// CREATE A CLASS A WITH METHODS
// CREATE A NEW CLASS B, 
// To pull in CLASS A METHODS, CREATE A NEW OBJECT
// CLASSA MYOBJECTNAME = NEW CLASSA();
//
// CALL IT
// MYOBJECTNAME.CLASSAMETHOD()