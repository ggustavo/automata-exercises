
import java.util.Scanner;

public class AutomataE1 {

	private static final Scanner SCANNER = new Scanner(System.in);
	
	private static final char STATE_ERROR = '0'; //Error State
	private static final char STATE_ONE = '1'; // Initial State
	private static final char STATE_TWO = '2'; 
	private static final char STATE_THREE = '3'; // Final State

	public static void main(String[] args) {

		System.out.println("Inform the chain: ");
		char[] chain = SCANNER.nextLine().toCharArray();
		char q = STATE_ONE; // Initial State
		for (char c : chain){ 
			
			switch (q) {
				case STATE_ONE:
					q = Character.isLetter(c) ? STATE_TWO : STATE_ERROR;
					continue;
				case STATE_TWO:
					q = Character.isLetterOrDigit(c) ? STATE_THREE : STATE_ERROR;
					continue;
				case STATE_THREE:
					q = Character.isLetterOrDigit(c) ? STATE_THREE : STATE_ERROR;
					continue;
				default:
					q = STATE_ERROR;
					break;
				}
			break;
			
		}
		
		if (q != STATE_ERROR && q == STATE_THREE)
			System.out.println("Valid string");
		else
			System.out.println("Invalid string");
		
	}
	
}
