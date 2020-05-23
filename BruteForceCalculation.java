package bruteForceEquation;
import java.util.Scanner;
import java.util.ArrayList;

public class BruteForceCalculation {
	
	public static int xInput;
	public static int yInput;

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		BruteForceInput.inputCapture(scnr);
		
		System.out.println(BruteForceInput.getArrayList());
		

	}

}
