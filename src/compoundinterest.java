// COMPOUND INTEREST FORMULA
// A = P(1+R)^n where A is the amount 
// P is the principal  which is 1000
// R is the rate
// n is the number of years



public class compoundinterest {
	public static void main(String[] args) {
		double amount;
		double principal = 10000;
		double rate = 0.01;
		
		
		for(int day=1; day<=20; day++) {
			amount = principal*Math.pow(1+rate, day);
			System.out.println(day + "  " + amount);
		}
	}

}
