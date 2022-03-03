/**
* Name: Lucas 
* Date: Mar.2
* Description: main method
*/

public class Lu_Lucas_OOQuiz1{
   public static void main(String[] args){
      //create objects
      Human human1 = new Human("Lucas", 65, 70);
      Vegetable vegetable1 = new Vegetable("cucumber", 20, 100);
      Cookie cookie1 = new Cookie();
      Cookie cookie2 = new Cookie("abcd", 20, 200);
      Cookie cookie3 = new Cookie("edfg", 30, 100, true);
      
      //eat packaged cookies
      human1.eat(cookie3, 20);
      
      //eat too much of vegetable
      human1.eat(vegetable1, 50); 
      
      System.out.printf("The energy before eating is: %d percent\n",human1.getEnergyLevel());
      
      //eat cookie and gain energy
      human1.eat(cookie2,10);
      
      //calories for cookie2 is 200, if eat 10 kg, the calories get is 100 and energy get is 100 / 15 = 6.7 percent the answer should be greater 6 than before
      System.out.printf("Current energy is: %d percent",human1.getEnergyLevel());
      
   }
}
