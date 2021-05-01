/* Shehan Liyanaarachchige - s4645652 
   KMR Sandeepa - s4645653 
   NIT2112
   Object Oriented Programming
   Unique Six
   24th Februrary 2021 
   This class checks for 6 unique numbers and make sure no value is duplicated. A count and the Facevalue is returned
   through this class.*/

package uniquesix;
//Importing the existing java class ArrayList
import java.util.ArrayList;
//Declaring a method called Player
public class Player {
    
    //Declaring a variable to store the count
    public int count;
    //Creating a object named value using the ArrayList class (To check the integer values)
    private ArrayList<Integer> value = new ArrayList();
    //Declaring a variable to store the current number rolled
    public int numRolled;
    
    //Method to check the 6 Unique numbers between 1 to 6
    public void valueCheck() 
    {
        //Creating an object named dice from the die class we created earlier. (The Die class will return a random number between 1 to 6)
        Die dice = new Die();
  
        //Use of Do-while loop to check the Uniquness of the numbers.
        do {
            numRolled = dice.rollDie(); //A random number between 1 and 6 will be stored in the variable numRolled
            count++; //Each time a random number is generated, the count will be incremented by 1
            
            if (!value.contains(numRolled)) { //Function to mitigate the duplicate values
                value.add(numRolled);
            }
        } while(value.size() < 6); //Checking if the number of elements stored is less than 6

    }
    public int getCount() //Method to return the count taken to generate the random numbers
    {
        return count;
    }
    public ArrayList<Integer> getfaceValue() //Method to return the integer value between 1 and 6
    {
        return value;
    }
        
    
    
}//End of Class Player

