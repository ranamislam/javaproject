package Homework4;
public class LargestValue
{
   int[] num = new int[5];


   public LargestValue()
   {
   
   }

   public LargestValue(int num1, int num2, int num3, int num4, int num5)
   {
      num[0] = num1;
      num[1] = num2;
      num[2] = num3;
      num[3] = num4;
      num[4] = num5;
   }

   public void displayLargestValue()
   {
      if(num[0] > num[1] && num[0] > num[2] && num[0] > num[3] && num[0] > num[4])
      {
         System.out.println(num[0] + " is the largest value among: " + num[1]
                                  + ", " + num[2] + ", " + num[3] + ", " + num[4]);
      }
      
      else if(num[1] > num[0] && num[1] > num[2] && num[1] > num[3] && num[1] > num[4])
      {
         System.out.println(num[1] + " is the largest value among: " + num[0]
                                  + ", " + num[2] + ", " + num[3] + ", " + num[4]);
      }
      
      else if(num[2] > num[0] && num[2] > num[1] && num[2] > num[3] && num[2] > num[4])
      {
         System.out.println(num[2] + " is the largest value among: " + num[0]
                                  + ", " + num[1] + ", " + num[3] + ", " + num[4]);
      }
      
      else if(num[3] > num[0] && num[3] > num[1] && num[3] > num[2] && num[3] > num[4])
      {
         System.out.println(num[3] + " is the largest value among: " + num[0]
                                  + ", " + num[1] + ", " + num[2] + ", " + num[4]);
      }
      
      else
      {
         System.out.println(num[4] + " is the largest value among: " + num[0]
                                  + ", " + num[1] + ", " + num[2] + ", " + num[3]);
      }
   }
}













