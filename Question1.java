import java.util.Scanner;

public class Question1
{
  public static void main (String[] args)
  {
    boolean continuing = true;
    while (continuing)
    {
      //This part of the program recieves the input from the user
      
      System.out.println("Enter a number in binary to convert to base 10: ");
      Scanner sc = new Scanner(System.in);
      String binaryinput = sc.next();
      int baseten = 0;  //this is the final answer
      //This part of the program checks if the number inputted is in fact a binary number. There is a break so that it stops if the number is invalid.
      
      int stringlength = binaryinput.length();
      for (int i = 0; i < binaryinput.length(); i++)
      {
        if (binaryinput.charAt(i) != '0' && binaryinput.charAt(i) != '1')
        {
          System.out.println("The number you have entered is not in binary. Please check that only ones and zeroes are inputted.");
          break;
        }
        else if (i == binaryinput.length()-1) //if it has gone through all the numbers
        {
          continuing=false;
          //This part of the program will convert a valid binary number into base 10
          
          int a=1;
          for (int m = binaryinput.length()-2; m >= 0; m--) //-1 for the string length since it starts at zero, another -1 cause im not using this loop to add the first digit (one)
          {
            a=a*2;            //honestly dont understand why we couldnt use math.pow
            if (binaryinput.charAt(m) == '1')
            {
              baseten = baseten+a;  
            }
            
          }
          if (binaryinput.charAt(stringlength-1) == '1')
          {
            baseten=baseten+1; //adds one for the last digit since the loop only does twos
          }
          System.out.println(binaryinput + " in base ten is written as " + baseten); 
        }
      }
    }
    
  }
}
