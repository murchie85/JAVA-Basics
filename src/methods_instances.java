


//  ***** THESE METHODS ARE CALLED BY APPLES CLASS



// public void returns nothing
// public String returns a string

public class methods_instances {
	// only the methods inside this class can use this variable
	private String girlName;
	
	// constructor object for quick use when called
	public methods_instances(String name) {
		girlName=name;
	}
	
	 
	public void setName(String name) {
		girlName = name; // whatever you typed in becomes girl name 
	}
	public String getName() {
		return girlName;
	}
	
	public void saying() {
		
		System.out.printf("your first girlfriend was %s", getName());
	}

}
