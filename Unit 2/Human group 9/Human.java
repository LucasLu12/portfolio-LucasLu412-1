/**
* Name: Lucas Lu and mohsen.li
* Date: Feb.28
* Description: In this Human class, I will create a contrustor, several attributes, Accessors include getName(), getWeight()
* getEnergyLvl(), getSex(), getAge(), and several Mutators include setEneregyLvl, sleep, run and toString method. In main method, I 
* will reate two Human objects and assign some values to it, then test all the methods, accessors and mutators
* attention: in this program, the energy level always greater than 0% and lower than 100%
*/

public class Human {
    /*
    * Attributes
    */
    /** the name of the human */
    private String name;
    /** the weight of the human */
    private double weight;
    /** the energyLvl of the human */
    private double energyLvl;
    /** the age of the human */
    private int age;
    /** the gender of the human */
    private String sex;

    /** 
     * Constructor
     */
    /**
     * create a human constructor with several paramters
     * @param name String type the name of the human
     * @param sex Int type the gender type of the human
     * @param age Double type the age of the human
     * @param weight Double type the weight of the human
     * @param energyLvl the energy level of the human
     */
    public Human(String name, String sex, int age, double weight, double energyLvl) {
        this.name       = name;
        this.weight     = weight;
        this.energyLvl  = energyLvl;
        this.sex        = sex;
        this.age        = age;
    }

    /*
    * Accessors
    */
    /** get the name attribute value in class
     * @return the name of the human
     */
    public String getName() {
        return this.name;
    }
    
    
    /** get the weight attribute value in class
     * @return the weight of the human
     */
    public double getWeight() {
        return this.weight;
    }
    
    
    /** get the energyLvl attributes value in class
     * @return the energyLvl of the human
     */
    public double getEnergyLvl() {
        return this.energyLvl;
    }
    
    
    /**
     * get the sex attributes value in class
     * @return the sex of the human
     */
    public String getSex() {
        return this.sex;
    }
    
    
    /** get the age attributes value
     * @return the age of the human
     */
    public double getAge() {
        return this.age;
    }

    /**
     * Mutators
     */
    /**
     * make some restrictions to energylevel to make sure it is limited between 0 to 100
     * @param energy the new energy level
     */
    public void setEneregyLvl(double energy) {
        if (energy > 100) { // user inputed a value greater than 100
            this.energyLvl = 100;
        } else if (energy < 0) { // user inputed a value less than 0
            this.energyLvl = 0;
        } else { // setting user's new energy level
            this.energyLvl = energy;
        }
    }
    
    /**
     * calculate the energy level with the sleep hours
     * @param hrs int type hours of sleep
     */
    public void sleep(int hrs) {
      // increasing the energy level by 10% per hour
      double new_energy = hrs * 0.1; //calculate how many percentages should be boost
      this.energyLvl = this.energyLvl * (1 + new_energy); //calculate the final energy Level
      
      //modify attributes value so that it always inside the boundary (0-100)
      setEneregyLvl(this.energyLvl); 
    }
    
    /**
     * after running 1km, the person will lose 0.001kg in weight, calculating current weight after running
     * @param km distance in which the human ran
     */
    public void run(double km) {
      this.weight = this.weight - (0.001 * km);
    }
    
    /**
     * returns all the attributes of the human in a String
     * @return a String with all attributes
     */
     public String toString() {
         return ("\nName: " + this.name + "\nAge: " + this.age + "\nWeight: " + this.weight + " kg\nEnergy Level: " + Math.round(this.energyLvl) + "%");
     }
     
    /**
     * Main method to test each method have been created 
     * @param args
     */
    public static void main(String [] args) {
      // creating two human objects with proper values
      Human human1 = new Human("Moe", "Male", 16, 70, 80);
      Human human2 = new Human("Arnold", "Male", 25, 200, 100);

      // amount of sleep for each human
      int human1_sleep = 1;
      int human2_sleep = 5;

      // amount of running for each human
      int human1_run = 1000;
      int human2_run = 2000;
      
      //test the methods, accessors, mutators
      //Test object 1!!!
      //test toString methods
      System.out.print("Test object 1 \nUsing toString to get all attributes values");
      System.out.println(human1.toString());
      
      //test all "get" accessors
      System.out.println("\nTest accessors \"get\" to print all attributes, it should be same with using toString prints out");
      System.out.println("Name: " + human1.getName());
      System.out.println("Age: " + human1.getAge());
      System.out.println("weight: " + human1.getWeight() + "kg");
      System.out.println("current energy level: " + (int)human1.getEnergyLvl() + "%");
      
      //test run method
      System.out.println("\nTest object 1 with run method");
      human1.run(human1_run);
      System.out.printf("After run %d km, the current weight is %.2f\n",human1_run,human1.getWeight());
      
      //test sleep method
      System.out.println("\nTestobject 1 with the sleep method");
      human1.sleep(human1_sleep);
      System.out.printf("After sleep %d hours, the current energy level should be: %.1f percent",human1_sleep,human1.getEnergyLvl());
      
      System.out.println("\n---------------------------------------------------------------------------------------------\n");
        
      //Test object 2
      //test toString methods
      System.out.print("Test object 2 \nUsing toString to get all attributes values");
      System.out.println(human2.toString());
      
      //test all "get" accessors
      System.out.println("\nTest accessors \"get\" to print all attributes, it should be same with using toString prints out");
      System.out.println("Name: " + human2.getName());
      System.out.println("Age: " + human2.getAge());
      System.out.println("weight: " + human2.getWeight() + "kg");
      System.out.println("current energy level: " + (int)human2.getEnergyLvl() + "%");
      
      //test run method
      System.out.println("\nTest object 2 with run method");
      human1.run(human2_run);
      System.out.printf("After run %d km, the current weight is %.1f\n",human2_run,human2.getWeight());
      
      //test sleep method
      System.out.println("\nTest object 2 with the sleep method");
      human1.sleep(human2_sleep);
      System.out.printf("After sleep %d hours, the current energy level should be: %.2f percent",human2_sleep,human2.getEnergyLvl());
      
    }
}
