import java.util.Scanner;

/**
 * ReverseString//ReverseString.java
 * @author carlosfmeneses
 * Created on 3/28/2019
 * Modified on 4/2/2019
 */

/**
 *  ReverseString 
 *  Enter a string and the program will reverse it and print it out
 *  from Martyr2'S Mega Project Ideas List!
 *  https://www.dreamincode.net/forums/topic/78802-martyr2s-mega-project-ideas-list/
 */
public class ReverseString {

	/**
	 * @param args Main program controller
	 */
	public static void main(String[] args) {
		String myString = getString("Enter a string: ");
		String myStringReversed = reverseString(myString);
		putString(myStringReversed);

	}

	/**
	 * @param display Display message
	 * @return myString User entered value
	 */
	private static String getString(String display) {
		Scanner myScanner = new Scanner(System.in);

		System.out.println(display);
		String myString = myScanner.nextLine();
		myScanner.close();

		return myString;
	}

	/**
	 * @param myString Value to reverse
	 * @return myStringReversed The reversed value
	 */
	private static String reverseString(String myString) {
		String myStringReversed = "";
		int x = 0;
		int myStringLength = myString.length();

		for (int i = myStringLength; i > 0; i--) {
			myStringReversed += myString.charAt(i - 1);
			x = x + 1;
		}
		return myStringReversed;
	}

	/**
	 * @param myStringReversed Value to echo
	 */
	private static void putString(String myStringReversed) {
		System.out.println(myStringReversed);

	}

}
