// roll a dice program 

import java.util.Random; // need to make an objectify this


public class RandomNumberGen26 {
	public static void main (String[] args) {
		Random dice = new Random();
		int number;
		
		for(int counter=1; counter<=10; counter++) {
			//number = dice.nextInt(6); // max number is 6 but starts at zero 
			number = 1 + dice.nextInt(6); // fix
			System.out.println(number + " " );
		}
		
	}
}
