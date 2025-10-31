// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int numvalue =  Integer.parseInt(args[0]);
		int hundreds = numvalue / 100;
		int ones =  numvalue % 10;
		int tens = (numvalue % 100 - ones)  / 10;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
