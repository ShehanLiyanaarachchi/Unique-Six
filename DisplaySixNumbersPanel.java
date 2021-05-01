/* Shehan Liyanaarachchige - s4645652 
   KMR Sandeepa - s4645653 
   NIT2112
   Object Oriented Programming
   Unique Six
   22nd Februrary 2021 
   DisplaySixNumbersPanel class has the main method which creates the JFrame and includes the components of 
   SixNumbersPanel with the aid of creating a object.*/


package uniquesix;
//Importing the Existing java classes required in advance 
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.stream.IntStream;


//Declaring the method DisplaySixNumbersPanel
public class DisplaySixNumbersPanel {
   
   //Main Method inside DisplaySixNumbersPanel
   public static void main(String args[]){
       JFrame w1 = new JFrame("Six Numbers Game"); //Creating an object named w1 from the JFrame class
       SixNumbersPanel mypanel = new SixNumbersPanel(); //Creating an object named mypanel from the SixNumbersPanel class
       w1.add(mypanel); //Adding SixNumbersPanel to the JFrame (DisplaySixNumbersPanel)
       w1.setSize(600, 350); //Setting the size for the JFrame (DisplaySixNumbersPanel)
       w1.setVisible(true); //Making the JFrame (DisplaySixNumbersPanel) visible
       w1.setLocationRelativeTo(null); //Centering the location of the JFrame (DisplaySixNumbersPanel)
       w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Setting the close operation when the close button is clicked
   }//End of Main Method 
}//End of DisplaySixNumbersPanel class

/* Shehan Liyanaarachchige - s4645652 
   KMR Sandeepa - s4645653 
   NIT2112
   Object Oriented Programming
   Unique Six
   22nd Februrary 2021 
   SixNumbersPanel has the components to be displayed inside the JFrame and the whole GUI is designed here,
   all the actions for the buttons are also declared here. Also the Logic of the Game is coded here*/

//Declaring the Six Numbers Panel class
class SixNumbersPanel extends JPanel //SixNumbersPanel inherits from JPanel
{
    
    int[] pOne = {0,0,0,0,0,0}; //Declaring an integer array variable pOne, of size 6, and storing 0 inside all the 6 elements
    int[] pTwo = {0,0,0,0,0,0}; //Declaring an  integer array variable pTwo, of size 6, and storing 0 inside all the 6 elements
    
    
    int p1count=0; //Variable to store the number of counts for player one (Initial count is initialized to 0)
    int p2count=0; //Variable to store the number of counts for player two (Initial count is initialized to 0)

    
    JTextArea results; //Display Area to Display the Count 
    
    //Six Numbers Display Area for Player 1
    JTextField p1num1; //Player one number 1 display area
    JTextField p1num2; //Player one number 2 display area
    JTextField p1num3; //Player one number 3 display area
    JTextField p1num4; //Player one number 4 display area
    JTextField p1num5; //Player one number 5 display area
    JTextField p1num6; //Player one number 6 display area
    
    //Six Numbers Display Area for Player 2
    JTextField p2num1; //Player two number 1 display area
    JTextField p2num2; //Player two number 2 display area
    JTextField p2num3; //Player two number 3 display area
    JTextField p2num4; //Player two number 4 display area
    JTextField p2num5; //Player two number 5 display area
    JTextField p2num6; //Player two number 6 display area
   
    
    
    JTextField p1rolledvalue; //Display Area for Rolled Value of player one

    JTextField p2rolledvalue; //Display Area for Rolled Value of player two
    
    //Declaring the buttons
    JButton p1rollDie; //Player one - Roll Die Button
    JButton p2rollDie; //Player two - Roll Die Button
    JButton exit;      //Exit Button 
    JButton newgame;   //New Game Button
    
    JLabel P1Rolledvalue; //Instruction Label for Rolled Value - Player one
    JLabel P2Rolledvalue; //Instruction Label for Rolled Value - Player two
    JLabel Playerone;     //Instuction Label for six Numbers - Player one
    JLabel Playertwo;     //Instruction Label for six Numbers - Player two
    
    public SixNumbersPanel() //Method to Design the GUI of SixNumbersPanel
    {
       setLayout(null); //To position the components inside SixNumbersPanel
       
       setBackground(Color.decode("#009999")); //Setting the background color of SixNumbersPanel
       
       //Player one JLabel Properties
       
       Playerone = new JLabel("Player one rolled Values Between 1 and 6");
       Playerone.setBounds(20,5,280,40);
       add(Playerone); //Adding JLabel Player one into SixNumbersPanel
       
       //Player two JLabel Properties
       
       Playertwo = new JLabel("Player two rolled Values Between 1 and 6");
       Playertwo.setBounds(340,5,280,40);
       add(Playertwo); //Adding JLabel Player two into Six Numbers Panel
       
       
       
       p1num1 = new JTextField();           //Player one number one display area
       p1num1.setBounds(20, 35, 35, 20);    //Properties of the size of the JTextField
       p1num1.setEditable(false);           //User will not be able to edit the JTextField
       add(p1num1);                         //Adding player one number one to the SixNumbersPanel
       
       p1num2 = new JTextField();                //Player one number two display area
       p1num2.setBounds(60, 35, 35, 20);       //Properties of the size of the JTextField
       p1num2.setEditable(false);                //User will not be able to edit the JTextField
       add(p1num2);                             //Adding player one number two to the SixNumbersPanel
       
       p1num3 = new JTextField();           //Player one number three display area
       p1num3.setBounds(100, 35, 35, 20);   //Properties of the size of the JTextField
       p1num3.setEditable(false);           //User will not be able to edit the JTextField
       add(p1num3);                         //Adding player one number three to the SixNumbersPanel
       
       p1num4 = new JTextField();               //Player one number four display area
       p1num4.setBounds(140, 35, 35, 20);       //Properties of the size of the JTextField
       p1num4.setEditable(false);            //User will not be able to edit the JTextField
       add(p1num4);                           //Adding player one number four to the SixNumbersPanel
       
       p1num5 = new JTextField();           //Player one number five display area
       p1num5.setBounds(180, 35, 35, 20);   //Properties of the size of the JTextField
       p1num5.setEditable(false);               //User will not be able to edit the JTextField
       add(p1num5);                 //Adding player one number five to the SixNumbersPanel
       
       p1num6 = new JTextField();           //Player one number six display area
       p1num6.setBounds(220, 35, 35, 20);   //Properties of the size of the JTextField
       p1num6.setEditable(false);           //User will not be able to edit the JTextField
       add(p1num6);                     //Adding player one number six to the SixNumbersPanel
            
       
       
       
       //Player 2 Score Area
       
       p2num1 = new JTextField();       //Player two number one display area
       p2num1.setBounds(340, 35, 35, 20);   //Properties of the size of the JTextField
       p2num1.setEditable(false);           //User will not be able to edit the JTextField
       add(p2num1);                                 //Adding player two number one to the SixNumbersPanel
       
       p2num2 = new JTextField();       //Player two number two display area
       p2num2.setBounds(380, 35, 35, 20);   //Properties of the size of the JTextField
       p2num2.setEditable(false);           //User will not be able to edit the JTextField
       add(p2num2);                     //Adding player two number two to the SixNumbersPanel
        
       p2num3 = new JTextField();       //Player two number three display area
       p2num3.setBounds(420, 35, 35, 20);   //Properties of the size of the JTextField
       p2num3.setEditable(false);           //User will not be able to edit the JTextField
       add(p2num3);                     //Adding player two number three to the SixNumbersPanel
       
       p2num4 = new JTextField();       //Player two number four display area
       p2num4.setBounds(460, 35, 35, 20);   //Properties of the size of the JTextField
       p2num4.setEditable(false);           //User will not be able to edit the JTextField
       add(p2num4);                         //Adding player two number four to the SixNumbersPanel
       
       p2num5 = new JTextField();       //Player two number five display area
       p2num5.setBounds(500, 35, 35, 20);   //Properties of the size of the JTextField
       p2num5.setEditable(false);               //User will not be able to edit the JTextField
       add(p2num5);                         //Adding player two number five to the SixNumbersPanel
       
       p2num6 = new JTextField();       //Player two number six display area
       p2num6.setBounds(540, 35, 35, 20);   //Properties of the size of the JTextField
       p2num6.setEditable(false);           //User will not be able to edit the JTextField
       add(p2num6);                         //Adding player two number six to the SixNumbersPanel
       
       //Player one rolled value Label Properties
       P1Rolledvalue = new JLabel("Rolled Value : "); //Label for Rolled Value for Player one 
       P1Rolledvalue.setBounds(20,60,100,40);
       add(P1Rolledvalue);              
       
       //Player two rolled value Label Properties    //Label for Rolled Value for Player two
       P2Rolledvalue = new JLabel("Rolled Value : ");
       P2Rolledvalue.setBounds(420,60,100,40);
       add(P2Rolledvalue);
       
       
       //Player one rolled value text Field Properties
       p1rolledvalue = new JTextField();    //Display area for Player one current rolled value
       p1rolledvalue.setBounds(100,70, 35, 20);
       p1rolledvalue.setEditable(false);
       add(p1rolledvalue);
       
       //Player two rolled value text Field Properties
       p2rolledvalue = new JTextField();    //Display area for Player two current rolled value
       p2rolledvalue.setBounds(500,70,35,20);
       p2rolledvalue.setEditable(false);
       add(p2rolledvalue);
       
       
       
       
       //Declaring the buttons
       
       //Roll Die Button for Player one and properties of it
       
       p1rollDie = new JButton("Player one - Roll Die");
       p1rollDie.setBounds(20,100,180,30);
       add(p1rollDie);
       
       //Roll Die Button for Player two and properties of it
       
       p2rollDie = new JButton("Player two - Roll die");
       p2rollDie.setBounds(390,100,180,30);
       add(p2rollDie);
       
       //New Game Button and properties of it
       
       newgame = new JButton("New Game");
       newgame.setBounds(250,80,100,30);
       add(newgame);
       
       //Exit Button and properties of it
       
       exit = new JButton("Exit ");
       exit.setBounds(260,120,80,30);
       add(exit);
       
        //Results Area and properties of it
       
       results = new JTextArea();
       results.setBounds(210,175,180,100);
       results.setEditable(false);
       add(results);
       
       exit.addActionListener((ActionEvent e)-> //Action listener for the Exit Button
       {
           System.exit(0); //When the User Clicks the Exit Button, the JPanel will exit
       });
       
       
       p1rollDie.addActionListener((ActionEvent e)->{  //Player one roll Die Button Action Listener
           
                                 //Lambda Function
           if ((IntStream.of(pOne).anyMatch(x-> x==0))) //Checks if Any of the Values inside the JTextFields of player one is 0
           {
               
           P1setNumbers(); //P1setNumbers method called upon the Player one roll Die button click
           p1rollDie.setEnabled(false);   //Player one roll Die Button Click disabled upon player one roll die button click
           p2rollDie.setEnabled(true);    //Player two roll Die Button Click enabled upon player one roll die button click
           p1count++;   //Count is incremented by 1 each time the player clicks the button player one roll die
           checkcountofp1(); //Calls the checkcountofp1 method
           } 
           else //If No value of JTextFields for Player one is equal to zero, the else condition will be implemented
           {
              //Popup Message Box displays the winner - player one winner and the counts taken to player one will be displayed
              JOptionPane.showMessageDialog(null, "Player One is the Winner! "+"\n"+"Number of Rolls : "+p1count+"\n"+"Game Over!");
           }
           
           
           
       });// End of Action for player one roll die button  
      
       
       p2rollDie.addActionListener((ActionEvent e)->{ //Player two roll Die Button Action Listener
           
                                   //Lambda Function
           if ((IntStream.of(pTwo).anyMatch(x-> x==0))) //Checks if Any of the Values inside the JTextFields of player two is 0
           {
               
           P2setNumbers(); //P2setNumbers method called upon the Player two roll Die button click
           p2rollDie.setEnabled(false);   //Player two roll Die Button Click disabled upon player two roll die button click
           p1rollDie.setEnabled(true);    //Player one roll Die Button Click enabled upon player two roll die button click
           p2count++;  //Count is incremented by 1 each time the player clicks the button player two roll die
           checkcountofp2(); //Calls the checkcountofp2 method
           
           } 
           else //If No value of JTextFields for Player two is equal to zero, the else condition will be implemented
           {
               //Popup Message Box displayer the winner - player two winner and the counts taken to player two will be displayed
               JOptionPane.showMessageDialog(null, "Player two is the Winner! "+"\n"+"Number of Rolls : "+p2count+"\n"+"Game Over!");
           }
           });//End of Player two roll Die Button Action
       
       newgame.addActionListener((ActionEvent e)->{ //Action Listener for New Game Button
          
           Clear(); //Calls the Clear method upon new game button click
           
       }); //End of Action for the New Game Button
    }
    public void checkcountofp1() //Method to check the number of counts for player one
    {
        results.setText(String.valueOf("Player one count : "+p1count)); //The count for player one will be displayed in the Results Area
    }
    public void checkcountofp2() //Method to check the number of counts for player two
    {
        results.setText(String.valueOf("Player two count : "+p2count)); //The count for player two will be displayed in the Results Area
    }
    
    public void P1setNumbers() //Method to Set the Numbers for Player one 
    {
        
        
        Die check = new Die(); //Creating an object named check from the class Die
      
        if(check.rollDie()==1) //Condition to check if the rolled number from the die class is equal to 1
        {
            p1num1.setText("1"); //Setting the player one number one value to 1
            p1rolledvalue.setText("1");//Number one will be displayed on the current rolled value for player one
            pOne[0] = 1; //Storing number one inside the zero'th element of the pOne array (For player one array)
        }
        else if (check.rollDie()==2) //Condition to check if the rolled number from the die class is equal to 2
        {
            p1num2.setText("2"); //Setting the player one number two value to 2
            p1rolledvalue.setText("2"); //Number two will be displayed on the current rolled value for player one
            pOne[1] = 2; //Storing number two inside the first element of the pOne array (For player one array)
        }
        else if (check.rollDie()==3) //Condition to check if the rolled number from the die class is equal to 3
        {
            p1num3.setText("3"); //Setting the player one number three value to 3
            p1rolledvalue.setText("3"); //Number three will be displayed on the current rolled value for player one
            pOne[2] = 3; //Storing number three inside the second element of the pOne array (For player one array)
        }
        else if (check.rollDie()==4) //Condition to check if the rolled number from the die class is equal to 4
        {
            p1num4.setText("4"); //Setting the player one number four value to 4
            p1rolledvalue.setText("4"); //Number four will be displayed on the current rolled value for player one
            pOne[3] = 4; //Storing number four inside the third element of the pOne array (For player one array)
        }
        else if (check.rollDie()==5) //Condition to check if the rolled number from the die class is equal to 5
        {
            p1num5.setText("5"); //Setting the player one number five value to 5
            p1rolledvalue.setText("5"); //Number five will be displayed on the current rolled value for player one
            pOne[4] = 5; //Storing number five inside the fourth element of the pOne array (For player one array)
        }
        else //Condition to satisfy the rolled value is 6
        {
            p1num6.setText("6"); //Setting the player one number six value to 6
            p1rolledvalue.setText("6"); //Number six will be displayed on the current rolled value for player one
            pOne[5] = 6; //Storing number six inside the fifth element of the pOne array (For player one array)
        }
         
    }//End of P1setNumbers method
    
     public void P2setNumbers() //Method to Set the Numbers for Player two
    {
 
        Die check = new Die(); //Creating an object named check from the class Die
        
        if(check.rollDie()==1) //Condition to check if the rolled number from the die class is equal to 1
        {
            p2num1.setText("1"); //Setting the player two number one value to 1
            p2rolledvalue.setText("1"); //Number one will be displayed on the current rolled value for player two
            pTwo[0]=1; //Storing number one inside the zero'th element of the pTwo array (For player two array)
        }
        else if (check.rollDie()==2) //Condition to check if the rolled number from the die class is equal to 2
        {
            p2num2.setText("2"); //Setting the player two number two value to 2
            p2rolledvalue.setText("2"); //Number two will be displayed on the current rolled value for player two
            pTwo[1]=2; //Storing number two inside the first element of the pTwo array (For player two array)
        }
        else if (check.rollDie()==3) //Condition to check if the rolled number from the die class is equal to 3
        {
            p2num3.setText("3"); //Setting the player two number three value to 3
            p2rolledvalue.setText("3"); //Number three will be displayed on the current rolled value for player two
            pTwo[2]=3; //Storing number three inside the second element of the pTwo array (For player two array)
        }
        else if (check.rollDie()==4) //Condition to check if the rolled number from the die class is equal to 4
        {
            p2num4.setText("4"); //Setting the player two number four value to 4
            p2rolledvalue.setText("4"); //Number four will be displayed on the current rolled value for player two
            pTwo[3]=4; //Storing number four inside the third element of the pTwo array (For player two array)
        }
        else if (check.rollDie()==5) //Condition to check if the rolled number from the die class is equal to 5
        {
            p2num5.setText("5"); //Setting the player two number five value to 5
            p2rolledvalue.setText("5"); //Number five will be displayed on the current rolled value for player two
            pTwo[4]=5; //Storing number five inside the fourth element of the pTwo array (For player two array)
        }
        else  //Condition to satisfy the rolled value is 6 
        {
            p2num6.setText("6"); //Setting the player two number six value to 6
            p2rolledvalue.setText("6"); //Number six will be displayed on the current rolled value for player two
            pTwo[5]=6; //Storing number six inside the fifth element of the pTwo array (For player two array)
        }
    }//End of P2setNumbers method
    
    public void Clear() //Method to reset all the values to defaults 
    {
        p1num1.setText(null); //Resets the value inside player one number one to empty
        p1num2.setText(null); //Resets the value inside player one number two to empty
        p1num3.setText(null); //Resets the value inside player one number three to empty
        p1num4.setText(null); //Resets the value inside player one number four to empty
        p1num5.setText(null); //Resets the value inside player one number five to empty
        p1num6.setText(null); //Resets the value inside player one number six to empty
        
        p2num1.setText(null); //Resets the value inside player two number one to empty
        p2num2.setText(null); //Resets the value inside player two number two to empty
        p2num3.setText(null); //Resets the value inside player two number three to empty
        p2num4.setText(null); //Resets the value inside player two number four to empty
        p2num5.setText(null); //Resets the value inside player two number five to empty
        p2num6.setText(null); //Resets the value inside player two number six to empty
        
        p1rolledvalue.setText(null); //Resets the value inside the current rolled value for player one to empty
        p2rolledvalue.setText(null); //Resets the value inside the current rolled value for player two to empty
        
        results.setText(null);  //Clears the text inside the results 
        
        p1rollDie.setEnabled(true); //Player one roll die button is enabled
        p2rollDie.setEnabled(true); //Player two roll die button is enabled
        
        p1count = 0; //p1count is set to 0
        p2count = 0; //p2count is set to 0
        
        pOne[0]=0; //pOne array element 0 is set to 0
        pOne[1]=0; //pOne array element 1 is set to 0
        pOne[2]=0; //pOne array element 2 is set to 0
        pOne[3]=0; //pOne array element 3 is set to 0
        pOne[4]=0; //pOne array element 4 is set to 0
        pOne[5]=0; //pOne array element 5 is set to 0
        
        pTwo[0]=0; //pTwo array element 0 is set to 0
        pTwo[1]=0; //pTwo array element 1 is set to 0
        pTwo[2]=0; //pTwo array element 2 is set to 0
        pTwo[3]=0; //pTwo array element 3 is set to 0
        pTwo[4]=0; //pTwo array element 4 is set to 0
        pTwo[5]=0; //pTwo array element 5 is set to 0
        
    }//End of Clear Method
    
    
}//End of class SixNumbersPanel

