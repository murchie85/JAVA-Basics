import java.util.Scanner;

public class increment {

	public static void main(String arg[]) {
		Scanner Adam = new Scanner(System.in);
		
		int tuna = 5;
		int bass = 18;
		++ tuna; // adds 1 
		System.out.println(++tuna);//adds another 1
		System.out.println("the value of bass is " + bass++); // wont increment until after print
	}
}


// pre increment ++x
// post increment x++ 