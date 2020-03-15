package Homework4;
import java.util.Scanner;
public class PlayingWithNumbers
{
   public static void main(String[] args)
   {
      getKeyboardInput();
   
      LargestValue largestValue = new LargestValue(num[0], num[1], num[2], num[3], num[4]);
      largestValue.displayLargestValue();
   
      OddAndEvenNumbers oe = new OddAndEvenNumbers(num[0], num[1], num[2], num[3], num[4]);
      oe.displayEvenNumbers();
      oe.displayOddNumbers();
   }

   private static int[] num = new int[5];

   private static void getKeyboardInput()
   {
      System.out.println("Please enter 5 different numbers: ");
      Scanner keyboard = new Scanner(System.in);
      for(int i = 0; i < 5; i++)
      {
         System.out.print("Number "+ (i+1) + ": ");
         num[i] = keyboard.nextInt();
      }
   }
}
