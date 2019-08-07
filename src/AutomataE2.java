

import java.util.Scanner;

public class AutomataE2 {

	private static final Scanner SCANNER = new Scanner(System.in);
	private static final char STATE_ERROR = '0'; //Error State
	private static final char STATE_A = '1'; // Initial State
	private static final char STATE_B = '2'; 
	private static final char STATE_C = '3'; 
	private static final char STATE_D = '4';
	private static final char STATE_E = '5';
	private static final char STATE_F = '6';
	private static final char STATE_G = '7'; // Final State

	public static void main(String[] args) {

		System.out.println("Inform the chain: ");
		char[] chain = SCANNER.nextLine().toCharArray();
		char q = STATE_A; // Initial State
		for (char c : chain){ 
			
			switch (q) {
				case STATE_A:
					q = Character.isDigit(c) ? STATE_B : STATE_ERROR;
					continue;
				case STATE_B:
					q = Character.isDigit(c) ? STATE_B : c == '.' ? STATE_C : STATE_ERROR;
					continue;
				case STATE_C:
					q = Character.isDigit(c) ? STATE_D : STATE_ERROR;
					continue;
				case STATE_D:
					q = Character.isDigit(c) ? STATE_D : c == 'E' ? STATE_E : STATE_ERROR;
					continue;
				case STATE_E:
					q = Character.isDigit(c) ? STATE_G : c == '+' || c=='-' ? STATE_F : STATE_ERROR;
					continue;
				case STATE_F:
					q = Character.isDigit(c) ? STATE_G : STATE_ERROR;
					continue;
				case STATE_G:
					q = Character.isDigit(c) ? STATE_G : STATE_ERROR;
					continue;
				default:
					q = STATE_ERROR;
					break;
				}
			break;
			
		}
		if (q != STATE_ERROR && (q == STATE_B || q == STATE_D || q == STATE_G))
			System.out.println("Valid string");
		else
			System.out.println("Invalid string");
		
	}

}

