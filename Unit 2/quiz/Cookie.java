/**
* Name: Lucas Lu
* Date: Mar.1
* Description: there are several attributes name, weight, calories, isPackaged, and three construtors with different
* paramters and appropriate accessors. If the cookies is opened, the open method will label it as false means it is opened
* eaten method has a double type parameter this means how much cookies were eaten, if cookie is packaged, just return -2 means
* it is not opened. if eaten weight equal zero or less than zero, return -1 means it is not eaten. Otherwise, calculate and return
* the calories cookies given
*/

public class Cookie{
  //attributes
  private String name;
  private double weight;
  private int calories;
  private boolean isPackaged;
  
  /**
  * This is default constuctor, if there is no parameter, system will assign attributes default value
  */
  public Cookie(){
    this.name = "";
    this.weight = -1;
    this.calories = -1;
    this.isPackaged = false;
  }
  
  /**
  * This is cookie constructor assign value to attributes with three paramters
  * @param name      String type which store cookie's name
  * @param weight    double type stores cookie's weight
  * @param calories  int type stores cookie's calories
  */
  public Cookie(String name, double weight, int calories){
    this.name = name;
    this.weight = weight;
    this.calories = calories;
    this.isPackaged = false;
  }
  
  /**
  * This cookie constructor assign values to attributes with four paramters
  * @param name       String type which store cookie's name
  * @param weight     double type stores cookie's weight
  * @param calories   int type stores cookie's calories
  * @param isPackaged boolean type to judge if it is packaged
  */
  public Cookie(String name, double weight, int calories, boolean isPackaged){
    this.name = name;
    this.weight = weight;
    this.calories = calories;
    this.isPackaged = isPackaged;
  }
  
  /**
  * accessors: return the name attributes value
  * @return return private attributes "name" in this class
  */
  public String getName(){
       return this.name;
  }
  
  /**
  * accessors: return the weight attributes value
  * @return return private attributes "weight" in this class
  */
  public double getWeight(){
       return this.weight;
  }
  
  /**
  * accessors: return the calories attributes value
  * @return  return private attributes "calories" in this class
  */
  public int getCalories(){
       return this.calories;
  }
  
  /**
  * accessors: return the isPackaged attributes value
  * @return  return private attributes "isPackaged" in this class
  */
  public boolean getIsPackaged(){
       return this.isPackaged;
  }
  
  /**
  * if it is opening, remove package and assign isPackaged attributes as false
  */
  public void open(){
       if(this.isPackaged){
         this.isPackaged = false;
       }
  }
  
  /**
  * This method judege how many calories the cookies give 
  * @param weight this is removed weight of cookies
  * @return -1            return -1 means the cookie is not eaten because weight is not losing or greater than the weight of cookie
  * @return -2            return -2 means this cookie is not eaten because it is still packaged
  * @return caloriesGiven double type return calories eaten cookies give 
  */
  public int eaten (double weight){
     if(weight == 0 || weight < 0 || weight > this.weight){
        return -1; // removed weight = 0 means it is not eaten
     } else if(this.isPackaged){
        return -2; // it is not eaten because it is still packaged
     } else{
        int caloriesGiven = (int)((double)this.calories * (weight / this.weight));
        return caloriesGiven; //return after eating cookies, how much calories were got
     }
  }
  
  /**
  * return all attributes
  * @return return attributes
  */
  public String toString(){
       return ("\nname: " + this.name + "\nweight: " + this.weight + "\ncalories: " + this.calories + "\nisPackaged: " + this.isPackaged);
  }
  }
