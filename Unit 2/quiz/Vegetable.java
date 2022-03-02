/**
* Name: Lucas Lu
* Date: Mar.1
* Description: In this file, there are attributs name, weight, calories and all accessors and some methods such as eaten, and toString
*/

public class Vegetable{
   private String name;
   private double weight;
   private int calories;
   
   /**
   * defualt constructor, assign default values 
   */
   Vegetable(){
      this.name = "";
      this.weight = -1;
      this.calories = -1;
   }
   
   /**
   * constuctors assign values to attributes
   * @param name name
   * @param weight weight
   * @param calories calories
   */
   Vegetable(String name, double weight, int calories){
      this.name = name;
      this.weight = weight;
      this.calories = calories;
   }
   
   /**
   * accessors
   * return attributes name
   */
   public String getName(){
       return this.name;
   }
   
   /**
   * accessors
   * return attributes weight
   */
   public double getWeight(){
       return this.weight;
   }
   
   /**
   * accessors
   * return attributes calories
   */
   public int getCalories(){
       return this.calories; 
   }
   
   /**
   * calculate if it is eaten or how much calories it gives
   * @return -1             means the vegetable were not eaten
   * @return caloriesGiven  how much calories was get after eating vetetables
   */
   public int eaten(double weight){
       if(weight < 0 || weight == 0 || weight > this.weight){
         return -1; // mean do not eat that or greater than the original weight
       } else {
         int caloriesGiven = (int)((double)calories * (weight / this.weight));
         return caloriesGiven; // return the calories was given
       }
   }
   
   /**
  * return all attributes
  * @return  return attributes in order
  */
  public String toString(){
       return ("\nname: " + this.name + "\nweight: " + this.weight + "\ncalories: " + this.calories);
  }

}
