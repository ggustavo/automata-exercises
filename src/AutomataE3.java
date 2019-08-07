

import java.util.Scanner;
 
public class AutomataE3 {
 
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final char STATE_ERROR = '0'; //Error State
    private static final char STATE_A = '1'; // Initial State // Final State
    private static final char STATE_B = '2'; 
    private static final char STATE_C = '3'; 
   
 
 
    public static void main(String[] args) {
 
        System.out.println("Inform the chain: ");
        char[] chain = SCANNER.nextLine().toCharArray();
      
        char q = STATE_A; // Initial State
        for (char c : chain){ 
        	
            switch (q) {
                case STATE_A:
                    q = c=='1'|c=='4'|c=='7' ? STATE_B : 
                    	c=='2'|c=='5'|c=='8' ? STATE_C : 
                    	c=='0'|c=='3'|c=='6'|c=='9' ? STATE_A: 
                    	STATE_ERROR;
                    continue;
                case STATE_B:
                	q = c=='1'|c=='4'|c=='7' ? STATE_C : 
                    	c=='2'|c=='5'|c=='8' ? STATE_A : 
                    	c=='0'|c=='3'|c=='6'|c=='9' ? STATE_B: 
                    	STATE_ERROR;
                    continue;
                case STATE_C:
                	q = c=='1'|c=='4'|c=='7' ? STATE_A : 
                    	c=='2'|c=='5'|c=='8' ? STATE_B : 
                    	c=='0'|c=='3'|c=='6'|c=='9' ? STATE_C: 
                    	STATE_ERROR;
                    continue;
                default:
                    q = STATE_ERROR;
                    break;
                }
            break;
             
        }
    
        if (q != STATE_ERROR && q == STATE_A)
			System.out.println("Valid string");
		else
			System.out.println("Invalid string");
        
    }
 
}