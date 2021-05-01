/* Shehan Liyanaarachchige - s4645652 
   KMR Sandeepa - s4645653 
   NIT2112
   Object Oriented Programming
   Unique Six
   24th Februrary 2021
   A test run will be implemented in this class and the output will be shown in the below Output area.
   Another main method is declared inside the TestSixNumbers class*/

package uniquesix;
//Importing the existing java class ArrayList
import java.util.ArrayList;
//Importing the existing java class Iterator
import java.util.Iterator;


public class TestSixNumbers {
    
    //Main Method
    public static void main(String args[])
    {
        //Declaring a object named user from the class Player
        Player user = new Player();
        //Using a existing class to create a object named "contains"
        ArrayList<Integer> contains = user.getfaceValue();
        //Calling the method valueCheck() inside the Player class
        user.valueCheck();
        //Initializing the iterator to run the program until 6 unique numbers are obtained
        Iterator iterate = contains.iterator();
        
        //Using the while loop to use the iterator
        while(iterate.hasNext())
        {
            System.out.println("Number Rolled : "+iterate.next()); //Printing the currently rolled number
        }
        //Printing the count taken to obtain 6 unique numbers between 1 and 6
        System.out.println("Congratulations, you have taken "+user.getCount()+ " rolls to get one of each\n" +"number between 1 and 6.");
        
    }//End of Main class
    
    
}//End of TestSixNumbers class
