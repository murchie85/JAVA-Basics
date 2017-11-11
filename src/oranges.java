


//  ***** THESE METHODS ARE CALLED BY APPLES CLASS



// public void returns nothing
// public String returns a string

public class oranges {
	// only the methods inside this class can use this variable
	private String girlName;
	
 
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
