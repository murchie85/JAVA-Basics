// Constructor allows you to initialize variables as soon as you create an object
// Constructor methods name has to be the same as the class name (that created in the other class)


// Example 
// the following returns null methods_instances tunaObject = new methods_instances();
// because We haven't given it a value.
// in the methods_instances class we create a method (that has the same name as the class) 
// in that method we set girlNmae = name; now we can just pass in a name in our object. 



	
public class constructor {
	
	public static void main(String[] arg) {
		
		methods_instances tunaObject = new methods_instances("Susan"); // must pass in sth
		tunaObject.saying();
	}
	
	

}
