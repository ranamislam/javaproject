import java.util.Scanner;
public class AnonymousClassDemo
{
    public static void main(String[] args)
    {
        int num;
        Scanner keyboard = new Scanner(System.in);

        IntCalculator sqaure = new IntCalculator()
        {
            public int calculor(int number)
            {
                return number * number;
            }
        };

        System.out.print("Enter an integer number: ");
        num = keyboard.nextInt();

        System.out.println("The square is " + sqaure.calculor(num));

    }
}
