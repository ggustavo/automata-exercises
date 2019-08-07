

import java.util.Scanner;
 
public class AutomataE4 {
 
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final char STATE_ERROR = '0'; //Error State
    private static final char STATE_A = '4'; //Initial State
    private static final char STATE_B = '5'; // Final State
   
 
 
    public static void main(String[] args) {
 
        System.out.println("Inform the chain: ");
        char[] chain = SCANNER.nextLine().toCharArray();
   
        //For Zwei
        char q = STATE_A; // Initial State
        for (char c : chain){ 
        	
            switch (q) {
                case STATE_A:
                    q = c=='1'|c=='3'|c=='5'|c=='7'|c=='9' ? STATE_A : 
                    	c=='0'|c=='2'|c=='4'|c=='6'|c=='8' ? STATE_B: 
                    	STATE_ERROR;
                    continue;
                case STATE_B:
                	q = c=='1'|c=='3'|c=='5'|c=='7'|c=='9' ? STATE_A : 
                    	c=='0'|c=='2'|c=='4'|c=='6'|c=='8' ? STATE_B: 
                    	STATE_ERROR;
                    continue;
                
                default:
                    q = STATE_ERROR;
                    break;
                }
            break;
             
        }
        
        if (q != STATE_ERROR && q == STATE_B)
			System.out.println("Valid string");
		else
			System.out.println("Invalid string");

    }
 
}