/*The following code is used to calculate a specific number in the Fibonacci
sequence.  The nth element of the Fibonacci sequence will be calculated and
printed.  The value of n will be dictated by the user.  The code will keep
prompting the user to ask them if they want to calculate a Fibonacci number
until the user says no.  */
package fibonacci;


//Utilities library.
import java.util.*;


/*Class to calculate and print the Fibonaaci number.  The user will get to 
choose which element in the FIbonacci sequence they want to know.  */
public class Fibonacci {
    
    //Main code.
    public static void main(String[] args) 
    {
        
        /*Variable to store the element (or index) of the desired number in the
        Fibonacci sequence.  Needs to be initialzed for array size 
        initialization.*/
        int element=0;
        
        /*Boolean variable to check whether or not an element number of the
        sequence was entered correctly.  Initialized to false.*/
        boolean success = false;
        
        
        //Array to hold the Fibonacci sequence numbers.
        int[] Fibonacci;
  
       
        /*Do..while loop.  Keep repeating this code until the user enters
        an integer greater than or equal to zero for the desired element of
        the Fibonacci sequence.  */
        do{
        
        /*Code to get user input for the desired element of the Fibonacci 
        sequence.*/
        try{
             
        //Set up the user input.   
        Scanner user_input = new Scanner(System.in);
        
        //Ask the user for the desired element of the Fibonacci sequence.
        System.out.println("Which element of the Fibonacci sequence do you want"
                + " to know?");
        System.out.println("The element must be an integer ranging from"
                + " 0 to 46: ");
        
        //Get the element from the user.  
        element = user_input.nextInt();
        
        /*Check to make sure that the integer entered by the user is greater
        than or equal to zero.*/
        if ( element < 0 || element > 46 ) {
        System.out.println("Only integers betwee 0 and 46 please"
                + ", try again.");
        continue;  // Will continue from the beginning of the do..while loop.
        }
        
        //Congratulate the user on inputting the element number correctly.
        System.out.println("Good job!");
        
        //Number has been entered correctly, so set the success boolean to true.
        success = true;
        
        }
        
         /*Exception code if anything other than an integer was entered by
         the user for the Fibonacci sequence element number.*/
         catch(InputMismatchException f) 
            {
            
            //Tell the user that they did not enter an integer.
            System.out.println("Not an integer, try again: " + f);
            
            }
        
        /*Close of the do..while loop.  The loop will continue until the 
        user successfully enters an integer for the Fibonacci element.*/ 
        }while(!success);
    
        /*Out of the loop, the Fibonacci element has been entered correctly,
        can now calculate the Fibonacci number at the element index specified.
        Let's initialize the Fibonacci sequence array size with the 
        element value first.*/
        Fibonacci = new int[element];
        
        //*Initialize the first two Fibonacci numbers in the array.
        Fibonacci[0] = 1;
        Fibonacci[1] = 1;
        
        /*Iterate through the array to calculate the Fibonacci sequence up
        to the final element number.*/
        for(int i = 2; i < element; i++)
        {
            /*Calcuate the Fibonacci number up to the element index
            specified by the user. */
            Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2];
            
        }
        
        /*Print the Fibonacci number at the element specified.  Subtract 1
        from the final index because Java arrays use zero as the first array
        index.*/
        System.out.println("The Fibonacci number at index " + element +
                " is " + Fibonacci[element-1]);
    }
    
}
