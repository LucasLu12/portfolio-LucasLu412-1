/**
* Name: Lucas Lu
* Date: Feb.15
* Description: get one angle in radians and two sides from input, create a method and return the smallest angle in degree
*/

import java.util.Scanner;

public class Lu_Lucas_SASTriangleSolver{
     public static void main(String args[]) {
    	 Scanner in = new Scanner(System.in);
    	 
    	 System.out.println("please enter angle in radian between two sides");
    	 double angleRadian = in.nextDouble();
    	 
    	 System.out.println("Please enter the first side of the triangle");
    	 double side1 = in.nextDouble();
    	 
    	 System.out.println("please enter the second side of the triangle");
    	 double side2 = in.nextDouble();
    	 
    	 double smallestAngle = triangleSolver(angleRadian,side1,side2);
    	 
    	 System.out.printf("The smallest angle in triangle is: %.2f", smallestAngle);
    	 
    	 
     }
     
     /**
     * convert radian angle to the degree and calculate all anlges in the triangle, then return smallest one in degree
     * @param angleRadian  double input value of angle in radian
     * @param side1  the first side beside that angle
     * @param side2  the second side beside that angle
     * @return return smallest angle in degree
     */
     public static double triangleSolver(double angleRadian, double side1, double side2) {
       //get the degree of angle given in radian
    	 double triangleDegree = angleRadian;
    	 double triangleSide1 = side1;
    	 double triangleSide2 = side2;
    	 
       //get the third sides and other angles
    	 double side3 = Math.sqrt(Math.pow(triangleSide1, 2) + Math.pow(triangleSide2, 2) - (2 * triangleSide1 * triangleSide2 * Math.cos(triangleDegree)));
       double secondDegree = Math.acos((Math.pow(triangleSide2,2) + Math.pow(side3,2) - Math.pow(triangleSide1,2)) / (2 * side3 * triangleSide2));
       secondDegree = secondDegree * 180 / 3.1415926;
       
       //convert all angles to the degree
    	 double thirdDegree = 180 - triangleDegree - secondDegree;
       triangleDegree = triangleDegree * 180 / 3.1415926;
    	 
       //compare those angles and return the smallest one
    	 if (secondDegree < triangleDegree && secondDegree < thirdDegree) {
    		 return secondDegree;
    	 } else if (triangleDegree < secondDegree && triangleDegree < thirdDegree) {
    		 return triangleDegree;
    	 } else if (thirdDegree < secondDegree && thirdDegree < triangleDegree) {
    		 return thirdDegree;
    	 } 
    	 return 0;
     }
}

