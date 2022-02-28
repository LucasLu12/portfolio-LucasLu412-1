/**
 * Name: Lucas Lu
 * Date: Feb.15
 * Discription: read the file "champions.json" and find the highestHp and lowestArmor with the name
 * use split several times to get the name, HP, and Armor, if Hp and armor is greater than last one, 
 * give its name to related name so that it could be output later
 */
import java.util.*;
import java.io.*;

public class Lu_Lucas_ChampionFilter {
    public static void main(String[] args){
    
      //initial armor and hp, the name inside will be replaced with any value in the file
      //because the hp must be greater than -1 and armor must be lower than 10000000
    	double lowestArmor = 10000000;
    	double highestHp = -1;
      
      //initial all name as empty
    	String nameHp = "empty";
    	String nameArmor = "empty";
    	String name = "empty";
    	    
      //read the file and find the value
      try {
    	   FileReader fileReader = new FileReader("champions.json");
       	BufferedReader output = new BufferedReader(fileReader);    	
       	String lineInfo;
          	
    	   //use while loop to judge if the system read all the lines inside the file
       	while ((lineInfo = output.readLine()) != null) {
             //first split the line with quotation marks
    	       String[] strSplit = lineInfo.split("\""); 
          
             //use length > 2 because if it is not greater than 2, there will be an error of index 1 in the if condition statement
             if(strSplit.length > 2){
               //if there occur name, put it in the name so that could be use later
               if(strSplit[1].equalsIgnoreCase("name")) {
    	     	    name = strSplit[3]; 
    	         }
    	    
               //if there occur an hp line, split it several times and get the double type value
    	         if(strSplit[1].equalsIgnoreCase("hp")) {
    	    	     String temStr[] = strSplit[2].split(":");
	              String temStr2[] = temStr[1].split(",");
                 //compare current hp with highest stored before
    	    	     if(Double.parseDouble(temStr2[0]) > highestHp) {
    	    	       highestHp = Double.parseDouble(temStr2[0]);
    	    		    nameHp = name;
    	    	     } 	    	
    	         }
    	       
               //if there occur an armor line, split it several times and get the double type value
    	         if(strSplit[1].equalsIgnoreCase("armor")) {
    	        	  String temStr[] = strSplit[2].split(":");
	              String temStr2[] = temStr[1].split(",");
                 //compare with lowest stored before
    	    	     if(Double.parseDouble(temStr2[0]) < lowestArmor) {
    	    		    lowestArmor = Double.parseDouble(temStr2[0]);
    	    		    nameArmor = name;
    	    	     } 
    	         }
    	      }
         }    
      
       	fileReader.close();
    	   output.close();
      }
      catch(IOException e){
    	   System.out.println("Cannot read the file");
      }
      
      //write the file
      try{
         File file = new File("MaxChampStats.txt");
         FileWriter fileWriter = new FileWriter(file);
         BufferedWriter output = new BufferedWriter(fileWriter);
         
         //write the related information to the file
         output.write(nameHp + " " + highestHp);
         output.newLine();          
         output.write(nameArmor + " " + lowestArmor);
         output.newLine();
         
         output.close();
         fileWriter.close();
      }
      catch(IOException e){
         System.out.println("cannot write the file");
      }  
    }
}
