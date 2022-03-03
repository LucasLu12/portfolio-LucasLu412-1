/**
* Name: Lucas Lu
* Date: Mar.1
* Description: this human file have three attributes, name, energy, and weight. a constructor Human and several accessors
* run method calculate how many weight lose after km, sleep method calculate how much energy got after hours
*/

public class Human{
   //attributes
   private String name;
   private double weight;
   private int energyLevel;
   
   /**
   * This constructor with no parameter 
   */
   public Human(){
       this.name = "";
       this.energyLevel = -1;
       this.weight = -1;
   }
   
   /**
   * assign the value to each attributes
   * @param  name    String  the name of human
   * @param  energy  double  the energy of human
   * @param  weight  double  the weight of human
   */
   public Human(String name, double weight, int energyLevel){
       this.name = name;
       this.energyLevel = energyLevel;
       this.weight = weight;
   }
   
   /**
   * accessors
   */
   
   /**
   * return the attribute name value
   * @return  String  return name attributes value
   */
   public String getName(){
       return this.name;
   }
   
   /**
   * return the attributes energy value
   * @return  int  return attributs energy value
   */
   public int getEnergyLevel(){
       return this.energyLevel;
   }
   
   /**
   * return the attributes weight value
   * @return double return attributes weight value
   */
   public double getWeight(){
      return this.weight;
   }
   
   /**
   * set energylevel always between 0 percent to 100 percent
   * @param energyLevel  int  indicate current energylevel
   */
   public void setEnergyLevel(int energyLevel){
     if (energyLevel > 100){
        this.energyLevel = 100;
     } else if(energyLevel < 0){
        this.energyLevel = 0;
     } else{
        this.energyLevel = energyLevel;
     }
   }
   
   /**
   * calculate how many weight lost after running and energy, each km will lose 3 percent of energy and 0.001 kg of weight
   * @param km  double  how many km is running    
   */
   public void run(double km){
      this.energyLevel = this.energyLevel - (int)(km * 3); //one km will lose 3 percent, because it stored as percentage, so it should be km *3
      this.weight = this.weight - km * 0.001;
      
      //set energyLevel
      setEnergyLevel(this.energyLevel);
   }
   
   /**
   * calculate how much energy get after sleeping, sleep one hour will boost 10 percent of energy
   * @param hours  double  how many hours is sleeping
   */
   public void sleep(double hours){
       this.energyLevel = this.energyLevel + (int)(hours * 10); //because energylevel stored as a percentage, so one hour boost 10 percent, it should be hours * 10
       
       //set energyLevl
       setEnergyLevel(this.energyLevel);
   }
   
   /**
   * calculate how many energyLevel get and how much weight get. The energy level will boost one percent each 15 calories
   * @param veg     Vegetable  this is the vegetable object
   * @param grams   double     type this is the amount of vegetable eaten
   */
   public void eat(Vegetable veg, double grams){
      //if greater than weight, print messages
      if(grams > veg.getWeight()){
         System.out.println("I don’t have that much food");
      } else{ // if it not greater than weight
         this.weight = this.weight + grams; //gain weight
      
         //gain energy from calories
         this.energyLevel = this.energyLevel + (int)(((grams / veg.getWeight()) * veg.getCalories()) / 15);    
         //make sure energy level do not exceed boundary
         setEnergyLevel(this.energyLevel);
      }
   }
   
   /**
   * calculate how many carlories we get and how much weight we get
   * @param food   cookie type the object of cookie
   * @param grams  double type the amount of cookie eaten
   */
   public void eat(Cookie food, double grams){
      //if greater than the wieght,print message
      if(grams > food.getWeight()){
         System.out.println("I don’t have that much food");
      } else if(food.getIsPackaged()){
         System.out.println("I can’t eat the bag");
      } else {
         this.weight = this.weight + grams; //gain weight
         //calculate how much energy get from food
         this.energyLevel = this.energyLevel + (int)(((grams / food.getWeight()) * food.getCalories()) / 15);
         //make sure it does not exceed boundary
         setEnergyLevel(this.energyLevel);
      }
   }
   
   /**
   * return attributes value
   * @return String return attributes value in order
   */
   public String toString(){
      return ("\nname: " + this.name + "\nenergyLevel: " + this.energyLevel + "\nweight: " + this.weight);
   }
}
