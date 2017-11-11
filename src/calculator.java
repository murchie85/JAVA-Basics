import java.util.Scanner;
class calculator{ 
	public static void main (String arg[]) {
		Scanner Adam = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = Adam.nextDouble();
		System.out.println("Enter second num: ");
		snum = Adam.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
		
	}
	
}