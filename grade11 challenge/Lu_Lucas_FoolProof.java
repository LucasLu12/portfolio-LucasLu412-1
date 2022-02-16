/**
 * Name: Lucas LU
 * Date: Feb.15
 * Description: Get the numberator and divisor from input and print the result. If divisor is zero, print that it could not be divide
 * if input value is a non-number type, print related message. If there is a problem, the program will not end until user input any words with
 * first character 'Q' or 'q'
 */
 
import java.util.Scanner;

public class Lu_Lucas_FoolProof {
    public static void main(String args[]) {
    	 Scanner in = new Scanner(System.in);
      String inputNum;
            
      do{
         System.out.print("Enter the numerator: ");
    	    inputNum = in.nextLine();
         
         //if the input is a number, run the below code
         if(isNumeric(inputNum)){
           //parse and store numerator and divisor into variables
           double inputNumD = Double.parseDouble(inputNum);
           System.out.print("Enter the divisor: ");
           double inputDivisor = Double.parseDouble(in.nextLine());
            
           //if divisor is zero, printf corresponding message
           if (inputDivisor == 0) {
             System.out.printf("You can't divide %.2f by %.2f ",inputNumD, inputDivisor);
           } else {
             //calculate and store the result to the variable
             double result = inputNumD / inputDivisor;
             System.out.printf("%.2f / %.2f is %.2f\n", inputNumD,inputDivisor,result);
           }

         } else {
           //if input value is not a number but it starts with character 'Q' or 'q', end the program
           if((inputNum.charAt(0)=='Q') || (inputNum.charAt(0)=='q')){
             break;
           }
           //if input value is not a number and not start with character 'Q' or 'q', print message
           System.out.println("You entered bad data.");
    		     System.out.println("Please try again.");
         }
      //if input value first character is not q or Q, continue loop until it is 
      }while(!(inputNum.charAt(0)=='Q') || !(inputNum.charAt(0)=='q'));
          	
    }
    
    /**
    * judge that if the input value is a number or not
    * @param strNum String input value
    * @return return true or false means that if it is a number
    */	    
    public static boolean isNumeric(String strNum){
    	try{
      //if it could be parse, return true
    		double number = Double.parseDouble(strNum);
      return true;
     }    	
     catch(NumberFormatException nfe) {
      //if it shows an error of casing, return false
    		return false;
    	}
    }
}
