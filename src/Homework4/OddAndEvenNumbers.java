package Homework4;

public class OddAndEvenNumbers
{
    int[] num = new int[5];
    int totalNumbers = num.length;
    int evenNumbers = 0;

    public OddAndEvenNumbers()
    {

    }

    public OddAndEvenNumbers(int num1, int num2, int num3, int num4, int num5)
    {
        num[0] = num1;
        num[1] = num2;
        num[2] = num3;
        num[3] = num4;
        num[4] = num5;
    }

    public void displayEvenNumbers()
    {

        if(num[0] % 2 == 0)
            evenNumbers++;

        if(num[1] % 2 == 0)
            evenNumbers++;

        if(num[2] % 2 == 0)
            evenNumbers++;

        if(num[3] % 2 == 0)
            evenNumbers++;

        if(num[4] % 2 == 0)
            evenNumbers++;

        System.out.println("Total number of even numbers: " + evenNumbers);
    }

    public void displayOddNumbers()
    {
        System.out.println("Total number of odd numbers: " + (totalNumbers - evenNumbers));
    }
}
