package bruteForceEquation;
import java.util.Scanner;
import java.util.ArrayList;

public class BruteForceInput {
	
	private static String input;
	private static int coefficient;
	private static ArrayList<Object> inputs = new ArrayList<Object>();
	
	public static void inputCapture(Scanner scnr) {
		
		System.out.println("Enter coefficients for your equation what it equals. Press 'q' to finish coefficient input:");
		
			do {
				System.out.println("Enter first coefficient: ");
				input = scnr.nextLine();
			
				if (input.equals("q")) {
					break;
				}
			} while (!(input.equals("q"))); {
				inputs.add(input);
			}
			
		}
	
	public static ArrayList getArrayList () {
		return inputs;
	}
	}

				
				