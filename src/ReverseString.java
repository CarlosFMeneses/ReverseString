import java.util.Scanner;

/**
 * ReverseString//ReverseString.java
 * @author carlosfmeneses
 * Created on 36/28/2019
 * Modified on 36/28/2019
 */

/**
 *  ReverseString 
 *  Enter a string and the program will reverse it and print it out
 *  from Martyr2'S Mega Project Ideas List!
 *  https://www.dreamincode.net/forums/topic/78802-martyr2s-mega-project-ideas-list/
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myString = getString("Enter a string: ");
		String myStringReversed = reverseString(myString);
		putString(myStringReversed);

	}

	/**
	 * @return
	 */
	private static String getString(String display) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println(display);
		String myString = myScanner.nextLine();
		
		return myString;
	}

	/**
	 * @param myString
	 * @return
	 */
	private static String reverseString(String myString) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param myStringReversed
	 */
	private static void putString(String myStringReversed) {
		// TODO Auto-generated method stub
		
	}

}
