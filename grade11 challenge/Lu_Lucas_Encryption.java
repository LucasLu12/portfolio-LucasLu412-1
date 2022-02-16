/**
 * Name:Lucas Lu
 * Date: Feb.10
 * Description: User input a string, my program will split them by space
 * the rule for encryption is change the first character and last character position
 * for middle characters, each character plus 2 in ASCII code
 */
import java.util.Scanner;
public class Lu_Lucas_Encryption{
  public static void main(String args[]){
    //declare scanner object 'in'
    Scanner in = new Scanner (System.in);

    System.out.println("please enter a line to be encrypted: ");
    
    //read the input and split them into several words by white space
    String input = in.nextLine();
    String[] inputSplit = input.split(" ");    
    String newString;
    
    //for loop i to encrypt each words in the string array
    for (int i = 0; i < inputSplit.length;i++){
    	//get the first char and last char of new words
        char firstCharEncry = inputSplit[i].charAt(inputSplit[i].length()-1);
        char LastCharEncry = inputSplit[i].charAt(0);
        
        //assign first char to new string(new encryption word)
        newString = firstCharEncry + "";
        char newChar;
      
        //for loop j to encrypt each character in each word
        for(int j = 1; j < inputSplit[i].length() - 1; j++){
            //each middle character plus 2 in ASCII and get the new character
            newChar = (char)(inputSplit[i].charAt(j) + 2);
            //add new character to new String
            newString = newString + newChar;
        }
        //after middle character, add the last character to the new String
        newString = newString + LastCharEncry;
        //assign new string to replace original word in the array
        inputSplit[i] = newString;
    }
    
    //print the encryption array
    System.out.print("The encryption is: ");
    for(String i:inputSplit){
       System.out.print(i + "  ");
    }      
  }
}
