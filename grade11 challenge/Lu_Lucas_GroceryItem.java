/**
 * Name: Lucas LU
 * Date: Feb.2
 * Description： This program will ask user for grocery items prices and print them in an appropriate way 
 * My program will ask user first item, first price and second item, second price
 */

import java.util.Scanner;

public class Lu_Lucas_GroceryItem {
      public static void main(String args[]) {
    	  Scanner in = new Scanner (System.in);
    	  System.out.println("Welcome to grocery checklist!");
    	  
    	  //get the input information
    	  System.out.println("What is the first item?");
    	  String firstName = in.next();
    	  
    	  System.out.println("What is the price of the first item?");
    	  double firstPrice = in.nextDouble();
    	  
    	  System.out.println("What is the second item?");
    	  String secondName = in.next();
    	  
    	  System.out.println("What is the price of the second item?");
    	  double secondPrice = in.nextDouble();
    	  
    	  in.close();
    	  
    	  //print the grocery items and price
    	  //item character is not longer than 20, i set left justify 
    	  //price is no greater than 99.99, so its digits will less than 5 and i set right justify
    	  System.out.println("----------------------------------");
    	  System.out.printf("%-20s #1     $%5.2f\n", firstName, firstPrice);
    	  System.out.printf("%-20s #2     $%5.2f\n", secondName, secondPrice);
    	  System.out.println("----------------------------------");  
      }
}
