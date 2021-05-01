/* Shehan Liyanaarachchige - s4645652 
   KMR Sandeepa - s4645653 
   NIT2112
   Object Oriented Programming
   Unique Six
   22nd Februrary 2021
   This class generates and returns a random number between 1 and 6*/

package uniquesix;
//Importing the Random Java class to Generate a random number
import java.util.Random;

public class Die
{
        //Declaring the method to roll a die 
        public int rollDie() {
       //Creating an object named random from the Random class(Random is a existing java class imported from the Random package)
        Random random = new Random();
        
        int num = random.nextInt(6)+1; //Condition to generate a random number BETWEEN 1 AND 6 , and that random number will be stored inside the num variable
        
        return num; //Returning the Random number between 1 and 6
        
    }//End of rollDie method
    
}//End of class Die

