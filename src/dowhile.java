//unlike the while loop, the do while tests the condition at least once 
public class dowhile {
	
	public static void main (String[] args) {
		int counter =0; // IF WE MADE THIS 15 it would still execute once
		
		do {
			System.out.println(counter);
			counter++;
			
		}
		while(counter<=10);
	}

}
