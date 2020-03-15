public class ArrayInitialization
{
    public static void main(String[] args)
    {
        /*
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int index = 0; index < 12; index++)
        {
            System.out.println("Month " + (index + 1) + " has " + days[index] + " days.");
        }
        */

        int[] numbers = {3, 6, 9};
        int[] num = new int[2];
        num[0] = 2;
        num[1] = 4;


        for(int x  : numbers)
            System.out.println(x);

        System.out.println();

        for(int y : num)
            System.out.println(y);


    }
}
