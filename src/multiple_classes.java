/// TUTORIAL 
//THIS CLASS CALLS A METHOD FROM ANOTHER CLASS 
// AND MAKES IT AN OBJECT
public class multiple_classes {
	public static void main(String args[]) {
		hello_world helloObject = new hello_world();
		helloObject.hi();
	}
}
//helloObject.methodname();
